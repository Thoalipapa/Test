package Package1;

public class Test2 {

	public static void main(String[] args) {
		Auto[] autos = {
				 new Auto("Ford", (long) 125000, 7999.99, "silber metallic", false, "Diesel", 101.0),
				 new Auto("Mercedes", (long) 63000, 22999.99, "blue silver", true, "Super", 137.0),
				 new Auto("Daihatsu", (long) 12000, 3099.99, "green dynamite", false, "Benzin", 75.0),
				 new Auto("Ford", (long) 1700, 17999.99, "silber metallic", false, "Diesel", 101.0),
				 new Auto("Mercedes", (long) 63000, 22999.99, "blue silver", true, "Elektro", 37.0),
				 new Auto("Daihatsu", (long) 12000, 3099.99, "green dynamite", true, "Benzin", 75.0),
				 new Auto("Ford", (long) 12500, 12999.99, "silber metallic", false, "Super", 121.0),
				 new Auto("Mercedes", (long) 6300, 32999.99, "blue silver", false, "Super", 137.0),
				 new Auto("Daihatsu", (long) 12000, 3099.99, "green dynamite", true, "Benzin", 75.0),
				 new Auto("Ford", (long) 1700, 17999.99, "silber metallic", false, "Diesel", 101.0),
				 new Auto("Mercedes", (long) 63000, 22999.99, "blue silver", true, "Elektro", 37.0),
				 new Auto("Daihatsu", (long) 12000, 3099.99, "green dynamite", true, "Benzin", 75.0)
				 };

		System.out.println("Erlös ohne Nachlässe: "+Auto.AllePreise(autos)+" €");
		
		System.out.println("Anteil an Unfallwagen: "+Auto.Unfallw(autos)+" %");
		
		System.out.println("Anteil an Dieselwagen: "+Auto.kraftstoff(autos)+" %");
		
		System.out.println("Anteil an Elektrowagen: "+Auto.kraftstoffE(autos)+" %");
		
		System.out.println("Erlös mit Nachlässen: "+Auto.mitNachlaessen(autos)+" €");
	}

	

}
