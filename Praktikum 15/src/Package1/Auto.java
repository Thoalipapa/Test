package Package1;

public class Auto {

	private String Hersteller;
	private long Laufleistung;
	private double Preis;
	private String Frabe;
	private boolean Unfallwagen;
	private String Kraftstoff;
	private double Leistung;
	

	
	
	public Auto(String hersteller, long laufleistung, double preis,
			String frabe, boolean unfallwagen, String kraftstoff,
			double leistung) {
		super();
		Hersteller = hersteller;
		Laufleistung = laufleistung;
		Preis = preis;
		Frabe = frabe;
		Unfallwagen = unfallwagen;
		Kraftstoff = kraftstoff;
		Leistung = leistung;
	}

	public Double getPreis() {
		return Preis;
	}

    public Boolean getUnfallwagen(){
    	return Unfallwagen;
    }

    public String getKraftstoff() {
		return Kraftstoff;
	}
    
    public static double AllePreise(Auto[] xs) {

		double counter = 0.0;
		for (int i = 0; i < xs.length; i++) {
			counter += xs[i].getPreis();
		}// hallojk sabfba s.fjabs

		return counter;
	}

	public static double Unfallw(Auto[] xs1) {

		double counter = 0.0;

		for (int i = 0; i < xs1.length; i++) {

			if (xs1[i].getUnfallwagen()) {
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
			if(xs[i].getUnfallwagen()){
				summe+=xs[i].getPreis();
				erlosunf=summe*((1-0.1));
			}
			if(xs[i].getUnfallwagen()==false){
				summe2+=xs[i].getPreis();
				erlosunffrei=summe2*((1-0.25));
			}
		}
		return erlosunf+erlosunffrei;
		
	        
	}
    

	public String richtigFalsch(boolean Unfallwagen) {

		if (Unfallwagen) {
			return "";
		} else {
			return "unfallfrei";
		}
	}

	

	public String toString() {
		return "Hersteller: " + this.Hersteller + "\n" + "Preis: " + this.Preis
				+ "\n" + "Motor: " + this.Leistung + "Ps (" + this.Kraftstoff
				+ ")\n" + "KM-Stand: " + this.Laufleistung + "\n" + "Farbe: "
				+ this.Frabe + "\n" + richtigFalsch(this.Unfallwagen);
		
	}

}
