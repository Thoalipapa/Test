package Package1;

public class Test4 {

	public static void main(String[] args) {
		new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		 new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		 new Auto("Daihatsu", 12000, 3099.99, "green dynamite", false, "Benzin", 75.0);
		 new Auto("Ford", 1700, 17999.99, "silber metallic", false, "Diesel", 101.0);
		 new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Elektro", 37.0);
		 new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		 new Auto("Ford", 12500, 12999.99, "silber metallic", false, "Super", 121.0);
		 new Auto("Mercedes", 6300, 32999.99, "blue silver", false, "Super", 137.0);
		 new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		 new Auto("Ford", 1700, 17999.99, "silber metallic", false, "Diesel", 101.0);
		 new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Elektro", 37.0);
		 new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);

		 double a = Auto.erloes_inkl_nachlass(0.1, 0.25);
		 double b = Auto.erloes_inkl_nachlass(0.1, 0.1);
		 double ProzentualSteigung = (100.0/a*b)-100.0;
		 double AbsoluteSteigung = b-a;
		 
		 System.out.println(String.format("Prozentuale Steigerung des Erlöses: %.2f", ProzentualSteigung)+"%");
		 System.out.println(String.format("Absolute Steigerung des Erlöses: %.2f", AbsoluteSteigung )+"€");
	}

}
