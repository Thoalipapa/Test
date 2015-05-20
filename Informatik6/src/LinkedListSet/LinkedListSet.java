package LinkedListSet;
import LinkedList.LinkedList;
import java.util.Iterator;


public class LinkedListSet<E extends Comparable<E>> implements Set<E> {

	LinkedList<E> liste; 
	//Konstruktor immer wenn New verwendet wird
	public LinkedListSet(){
		this.liste= new LinkedList<E>();
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return liste.size();
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return liste.isEmpty();
	}
	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return liste.contains(e);
	}
	@Override
	public boolean add(E e) {
		if(contains(e)){
			return false;
		}
		return liste.add(e);
	}
	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return liste.remove(e);
	}
	@Override
	public void clear() {
	liste.clear();	// TODO Auto-generated method stub
		
	}
	@Override
	public E getMatch(E e) {
		// TODO Auto-generated method stub
		return liste.getMatch(e);
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return liste.iterator();
	}
	public String toString(){
		return liste.toString();
	}
	
}