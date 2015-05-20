import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitMultiSet {
	/*
	 * Test auf die Größe.
	 */
	@Test
	public void sizeTest(){
		Multiset<String> test = new LinkedListMultiSet<String>();
		test.add("und");
		test.add("und");
		assertTrue(test.size() == 2);
	}
	
	/*
	 *  Test auf verschiedene Worte. 
	 */
	@Test
	public void distinctTest(){
		Multiset<String> test2 = new LinkedListMultiSet<String>();
		test2.add("und");
		test2.add("oder");
		assertTrue(test2.distinct() == 2);
	}
	
	/*
	 *  Test auf leer.
	 */
	@Test
	public void isEmptyTest(){
		Multiset<String> test3 = new LinkedListMultiSet<String>();
		test3.add("und");
		test3.remove("und");
		assertTrue(test3.isEmpty());
	}
	
	/*
	 *	Test auf gleichheit
	 */
	@Test
	public void containsTest(){
		Multiset<String> test4 = new LinkedListMultiSet<String>();
		test4.add("und");
		assertTrue(test4.contains("und"));
	}
	
	/*
	 * Test auf löschen der gesamten Liste
	 */
	@Test
	public void clearTest(){
		Multiset<String> test5 = new LinkedListMultiSet<String>();
		test5.add("und");
		test5.add("oder");
		test5.add("und");
		test5.clear();
		assertTrue(test5.isEmpty());
	}
	
	/*
	 * Test auf gleichheit in der Liste
	 */
	@Test
	public void getMatchTest(){
		Multiset<String> test6 = new LinkedListMultiSet<String>();
		test6.add("und");
		
		assertTrue(test6.getMatch("und") == "und");
	}
	/*
	 * Test auf NULL
	 */
	@Test
	public void getMatchTest2(){
		Multiset<String> test7 = new LinkedListMultiSet<String>();
		assertTrue(test7.getMatch("und") == null);
	}
	
	/*
	 * Test auf anzahl gleicher Worte
	 */
	@Test
	public void countTest(){
		Multiset<String> test8 = new LinkedListMultiSet<String>();
		test8.add("und");
		test8.add("und");
		test8.add("und");
		assertTrue(test8.count("und") == 3);
	}
	/*
	 * Fehler erzeugen 
	 */
	@Test
	public void countFailTest(){
		Multiset<String> test9 = new LinkedListMultiSet<String>();
		test9.add("und");
		test9.add("und");
		test9.add("und");
		assertFalse(test9.count("und") == 1);
	}
	
}
