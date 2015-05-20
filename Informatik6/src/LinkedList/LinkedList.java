package LinkedList;

import java.util.Iterator;

public class LinkedList<E extends Comparable<E>> implements List<E> {
	class Cursor implements Iterator<E> {
		private Zelle<E> z;
		
		// Zeigt die Postion einer Zelle z an
		private Cursor(Zelle<E> z) { 
			this.z = z;
		}

		// Schickt den Cursor auf den Anfang der Liste.
		private void goToFirst() {	
			z = anker;
		}

		// Guckt ob der Cursor auf den Letzen Platz ist.
		private boolean atEnd() {
			return z.next == null;
		}
		
		// Zeigt auf den nächsten Zeichen, wenn es nicht am Ende der Liste ist.
		private void goToNext() {
			if (!atEnd())
				z = z.next;
		}

		// Geht mit dem Cursor zu stelle e
		private void goTo(E e) {
			goToFirst();
			while (!atEnd() && e.compareTo(get()) != 0) 
				goToNext();
		}

		// Zeigt auf die nächste Zelle und fügt zwischen den beiden Zellen eine 
		// neue Zelle mit dem Inhalt e ein
		private void add(E e) {
			z.next = new Zelle<E>(e, z.next);
			goToNext();
		}

		// Entfert an der Stelle des Cursors
		public void remove() {
			if (z.next != null)
				z.next = z.next.next;
		}
		
		// Der Cursor nimmt den jetzigen Inhalt raus.
		private E get() {
			return z.next.inhalt;
		}

		// Guckt ob noch ein nächster Inhalt vorhanden ist.
		public boolean hasNext() {
			return !this.atEnd();
		}

		// setzt den Cursor einen weiter.
		public E next() {
			E element = this.get();
			this.goToNext();
			return element;
		}

	}
	
	public LinkedList(){
		anker = new Zelle<E>();
		this.cursor= new Cursor(anker);
		
	}
	
	public String toString(){
		
		String ausgabe="";
		cursor.goToFirst();
		while(!cursor.atEnd()){
			ausgabe+=cursor.get() + "\n";
			cursor.goToNext();
			
		}
		return ausgabe;
	}
	
	
	private Zelle<E> anker;
	private Cursor cursor;
	

	public void goToFirst() {
		cursor.goToFirst();
	}

	public void goToNext() {
		cursor.goToNext();
	}

	public boolean atEnd() {
		return cursor.atEnd();
	}

	public boolean add(E e) {
		cursor.add(e);
		return true;
	}

	public boolean remove() {
		if (cursor.atEnd())
			return false;
		else {
			cursor.remove();
			return true;
		}
	}

	public void goTo(E e) {
		cursor.goTo(e);
	}

	public E get() {
		if (cursor.atEnd())
			return null;
		else
			return cursor.get();
	}

	public Iterator<E> iterator() {
		
		return (Iterator<E>) new Cursor(anker);
	}

	// Cursor ist am Anfang. Für jede Zelle wird der Counter um ein erhöht.
	public int size() {
		Cursor a = new Cursor(anker);
		int counter = 0;
		while(!a.atEnd()){
			a.goToNext();
			counter++;
		}
		return counter;
	}

	// Geht mit Cursor zur ersten Stelle und falls es NULL ist, wird True geliefert.
	public boolean isEmpty() {			
		return anker.next == null;
	}

	// wird mit goTo(e) nach e gesucht und wenn es sich in der Liste befindet, 
	// so ist es nicht am ende angekommen und liefer uns das gewünschte FALSE!
	public boolean contains(E e) {
		goTo(e);		  
	 return !atEnd();
	}

	
	// Geht mit dem Cursor an die erste Stelle und geht solange durch bis e gefunden wird
	// und löscht sie aus der Liste.
	public boolean remove(E e) {
		Cursor c = new Cursor(anker);
		c.goToFirst();
		
		while(!c.atEnd()){
			E a = c.get();
			
			if(e.compareTo(a)==0){
				c.remove();
				return true;
			}
			c.goToNext();			
		}		
		return false;
	}

	// Geht mit Cursor an die erste Stelle und geht solange die Liste durch 
	// bis er am Ende ist und dabei wird immer removed.
	public void clear() {
		Cursor rAll = new Cursor(anker);
		rAll.goToFirst();
		while(!rAll.atEnd()){			
			rAll.remove();			
						
		}		
	}

	// Geht mit Cursor an die erste Stelle und geht solange die Liste durch
	// bis er e gefunden hat und gibt sie aus, sonst gibt es NULL aus.
	public E getMatch(E e) {
		Cursor finder = new Cursor(anker);
		finder.goToFirst();
		if(contains(e)){
			return e;			
		}
		return null;
	}
}