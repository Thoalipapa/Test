import LinkedListSet.*;


public class LinkedListMultiSet<E extends Comparable<E>> implements Multiset<E>  {
	private int counter  = 0;//Counter für gesamteanzahl der Wörter
	
	private Set<Entry<E>> list = new LinkedListSet<Entry<E>>();
	
	//toString-Methode mit StringBuilder.
	public String toString(){
		
		StringBuilder ausgabe = new StringBuilder();
		
		for(Entry<E> e : list){
			ausgabe.append(e.getElement());
			ausgabe.append(": ");
			ausgabe.append(e.getCount());
			ausgabe.append("\n");			
		}
		return ausgabe.toString();
	}
	
	//Gibt die Größe der Liste aus
	public int size() {		
		return counter;
	}
	
	// Gibt die Anzahl der verschiedenen Worte in der Liste aus
	public int distinct() {
		return list.size();
	}

	//Prüft ob die Liste list leer ist.
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/*
	 * Prüft ob das ELement bereits in der Liste existiert
	 */
	@Override
	public boolean contains(E e) {
		return list.contains(new EntryImpl<E>(e));
	}

	//Fügt ein Objekt e, falls es noch nicht existiert, ein
	public boolean add(E e) {
		EntryImpl<E> element=new EntryImpl<E>(e);
		
		
		//Falls element e existiert, den couter vom element hochzählen und den gesamt counter auch
		for(Entry<E> a:list){
			if(a.compareTo(element)==0){
				a.incCount();
				counter++;
				return true;
			}
		}
		
		// element wird eingefügt
		list.add(element);
		counter++;  // counterfür size hochzählen
		
		
	return false;	
		
	}

	/*
	 * Element e wird entfernt und der Counter runtergezählt. Falls counter vom element auf 0 wird element aus der liste entfernt
	 */
	@Override
	public boolean remove(E element) {
		EntryImpl<E> e=new EntryImpl<E>(element);
		
		for(Entry<E> a:list){
			if(0 ==a.compareTo(e) ){
				a.decCount();
				counter--;
				if(a.getCount()==0){					
					list.remove(a);
				}
				return true;
			}
		}
		return false;
	}

	/*
	 * Liste wird komplett gelöscht
	 */
	@Override
	public void clear() {		
		this.list.clear();
	}

	
	/*
	 * Falls element nicht in der Liste enthalten ist wird null geliefert sonst wird das element zurückgeliefert
	 */
	@Override
	public E getMatch(E e) {
		if(!list.contains(new EntryImpl<E>(e))) return null;
		return list.getMatch(new EntryImpl<E>(e)).getElement();
	}

	/*
	 * Liefer die anzahl wie oft ein Element in der Liste enthalten ist
	 */
	@Override
	public int count(E element) {
		EntryImpl<E> a = new EntryImpl<E>(element);	
				
		for(Entry<E> e:list){
			if(a.compareTo(e)==0){					
				return e.getCount();
			}
		}
		return 0;
	}

}
