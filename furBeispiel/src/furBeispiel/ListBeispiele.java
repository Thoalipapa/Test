package furBeispiel;

import java.util.LinkedList;
import java.util.List;

public class ListBeispiele {

	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List<Comparable> v = new LinkedList<Comparable>();
		v.add(5);
		v.add(6);
		v.add(1,"hallo");
		v.remove(1);
		System.out.println(v);
		

	}
	
	
}
