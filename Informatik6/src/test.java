import java.util.Scanner;


public class test {
	public static void main(String[] args) {
		
        Multiset<String> words = new LinkedListMultiSet<String>();                               
		Scanner scanner = new Scanner(System.in);
         int counter =0;

          while(scanner.hasNext()){
        	  String t = scanner.next();
        	  t=t.replaceAll("\\p{Punct}", "");
		      words.add(t);
		      counter++;
          }
          
          
		System.out.println(words);  
		System.out.println("Anzahl gesammten Wörtern: "+counter);
		System.out.println("Anzahl verschiedenen Wörtern: "+words.distinct());
		scanner.close();
		
	}
}
