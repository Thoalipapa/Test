package Package1;

public class Test2 {

	public static void main(String[] args) {
		
		new Auto("Ford", (long) 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		 new Auto("Mercedes", (long) 63000, 22999.99, "blue silver", true, "Super", 137.0);
		 new Auto("Daihatsu", (long) 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		
		 for(Auto a : Auto.getBestand()) System.out.println(a);
		 System.out.println("Insgesamt " + Auto.getAnzahl() + " Autos im Bestand.");
		
		
	}

	public static double AllePreise(Auto[] xs) {

		double counter = 0.0;
		for (int i = 0; i < xs.length; i++) {
			counter += xs[i].getPreis();
		}

		return counter;
	}

	public static double Unfallw(Auto[] xs1) {

		double counter = 0.0;

		for (int i = 0; i < xs1.length; i++) {

			if (xs1[i].isUnfallwagen()) {
				counter++;
			}

		}

		return 100 / (xs1.length / counter);
	}

	
	public static float kraftstoff(Auto[] autos) {
		float count = 0;
		for (int i = 0; i < autos.length; i++) {
			if (autos[i].getKraftstoff() == "Diesel") {
				count++;
			}

		}
		return (count/autos.length)*100;
	}

	
	public static float kraftstoffE(Auto[] autos) {
		float count = 0;
		for (int i = 0; i < autos.length; i++) {
			if (autos[i].getKraftstoff() == "Elektro") {
				count++;
			}

		}
		return (count/autos.length)*100;
	}
	
	public static double mitNachlaessen(Auto[] xs){
		
		double summe =0.0;
		double summe2 =0.0;
		double erlosunf=0.0;
		double erlosunffrei=0.0;
		
		for (int i = 0; i < xs.length; i++) {
			if(xs[i].isUnfallwagen()){
				summe+=xs[i].getPreis();
				erlosunf=summe*((1-0.1));
			}
			if(xs[i].isUnfallwagen()==false){
				summe2+=xs[i].getPreis();
				erlosunffrei=summe2*((1-0.25));
			}
		}
		return erlosunf+erlosunffrei;
		
	        
	}

}
