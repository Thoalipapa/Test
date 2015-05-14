package furBeispiel;

import java.util.*;


public class ListBeispiele1 {

	public static void main(String[] args) {
		
		List<Object> v = new LinkedList<Object> ();
		v.add("Eins");
		v.add("Zwei");
		v.add(1,"Drei");
		
		Iterator it = v.iterator();
		while (it.hasNext()){
			System.out.println(it);
		}
		
		// seite 53
		
		
		
		

	}

}
