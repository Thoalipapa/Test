package Package1;

public class Test2 {

	public static void main(String[] args) {
		
		new Auto("Ford", (long) 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		 new Auto("Mercedes", (long) 63000, 22999.99, "blue silver", true, "Super", 137.0);
		 new Auto("Daihatsu", (long) 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		
		 for(Auto a : Auto.getBestand()) System.out.println(a);
		 System.out.println("Insgesamt " + Auto.getAnzahl() + " Autos im Bestand.");
		
		
	}

}
