
public class EntryImpl < E extends Comparable<E>> implements Entry<E>{
	E item;
	int count;
	
	public EntryImpl(E element){
		item=element;
		count=1;
		
	}
	
	@Override
	public int compareTo(Entry<E> o) {
		return item.compareTo(o.getElement());
	}

	@Override
	public E getElement() {
		return item;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void incCount() {
		count++;
	}

	@Override
	public void decCount() {
		count--;
	}

}
