package Package1;

import java.util.ArrayList;
import java.util.List;

public class Auto {

	private String Hersteller;
	private Long Laufleistung;
	private Double Preis;
	private String Frabe;
	private Boolean Unfallwagen;
	private String Kraftstoff;
	private Double Leistung;
	
	static List <Auto> list= new ArrayList<Auto>();
	

	
	
	public Auto(String hersteller, Long laufleistung, Double preis,
			String frabe, Boolean unfallwagen, String kraftstoff,
			Double leistung) {
		super();
		Hersteller = hersteller;
		Laufleistung = laufleistung;
		Preis = preis;
		Frabe = frabe;
		Unfallwagen = unfallwagen;
		Kraftstoff = kraftstoff;
		Leistung = leistung;
		list.add(this);
	}
	public  static List<Auto> getBestand(){
		return list;
	}
	public static int getAnzahl(){
		int counter=0;
		for (@SuppressWarnings("unused") Auto auto : list) {
			counter++;
		}
		return counter;
	}

	public Double getPreis() {
		return Preis;
	}

    public Boolean isUnfallwagen(){
    	return Unfallwagen;
    }
   
    public String getHersteller() {
		return Hersteller;
	}

	public Long getLaufleistung() {
		return Laufleistung;
	}

	public String getFrabe() {
		return Frabe;
	}

	public Double getLeistung() {
		return Leistung;
	}

	public String getKraftstoff() {
		return Kraftstoff;
	}

	public String richtigFalsch(boolean Unfallwagen) {

		if (Unfallwagen) {
			return "";
		} else {
			return "unfallfrei";
		}
	}
	
    public static double erloes_inkl_nachlass( double in1, double in2){
		
    	
		for (int i = 0; i < getAnzahl(); i++) {
			//Auto a = list.get(i);
		//	if(a.)
		}

		return in2;
	}

	

	public String toString() {
		return "Hersteller: " + this.Hersteller + "\n" + "Preis: " + this.Preis
				+ "\n" + "Motor: " + this.Leistung + "Ps (" + this.Kraftstoff
				+ ")\n" + "KM-Stand: " + this.Laufleistung + "\n" + "Farbe: "
				+ this.Frabe + "\n" + richtigFalsch(this.Unfallwagen)+"\n";
		
	}

}
