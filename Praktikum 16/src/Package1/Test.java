package Package1;

public class Test {
	
	
	public static void main(String[] args) {
		 Auto[] autos = {
				 new Auto("Ford", (long) 125000, 7999.99, "silber metallic", false, "Diesel", 101.0),
				new Auto("Mercedes", (long) 63000, 22999.99, "blue silver", true, "Super", 137.0),
			 new Auto("Daihatsu", (long) 12000, 3099.99, "green dynamite", true, "Benzin", 75.0)
			 };
		 
				 bubbleSort(autos);
				 for(Auto a : autos) {
				 System.out.println(a);
				 System.out.println();
				
				 }
				 
				
	}
	
	
	
	public static void bubbleSort(Auto[] xs) {
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < xs.length - 1; i++) {
				if (!(xs[i].getPreis() >= xs[i+1].getPreis())) {
				    Auto dummy = xs[i];
					xs[i] = xs[i + 1];
					xs[i + 1] = dummy;
					unsorted = true;
				}
			}
		}
	}

}
