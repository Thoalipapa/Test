
public interface Multiset<E> extends Collection<E> {
	
	int count(E element); // liefert die H�ufigkeit des Elementes

	int distinct(); // liefert die Anzahl der verschiedenen Elemente

	String toString(); // liefert eine Stringrepr�sentation der Multimenge

}