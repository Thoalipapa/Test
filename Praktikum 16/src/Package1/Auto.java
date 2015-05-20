package Package1;

import java.util.ArrayList;
import java.util.List;

public class Auto {

	private String Hersteller;
	private long Laufleistung;
	private double Preis;
	private String Frabe;
	private boolean Unfallwagen;
	private String Kraftstoff;
	private double Leistung;
	
	static List <Auto> list= new ArrayList<Auto>();
	

	
	
	public Auto(String hersteller, long laufleistung, double preis,
			String frabe, boolean unfallwagen, String kraftstoff,
			double leistung) {
		
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
		for ( @SuppressWarnings("unused") Auto auto : list) {
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

	
	
    public static double erloes_inkl_nachlass( double nachlassunfallfrei, double nachlassunfall){
		
    	double wert=0.0;
		for (int i = 0; i < getAnzahl(); i++) {
		Auto a = list.get(i);
			if(a.Unfallwagen){
				wert+=(a.Preis*(1-nachlassunfall));
			}
			if(a.Unfallwagen==false){
				wert+=(a.Preis*(1-nachlassunfallfrei));
			}
		}

		return wert;
	}
    
    public static double anteil_kraftstoffart(String s){
    	
    	double wert=0.0;
    	Auto a;
    	for (int i = 0; i < getAnzahl(); i++) {
			a=list.get(i);
			if(a.Kraftstoff==s){
				wert++;
			}
		}
    	
    	return 100/(double)getAnzahl()*wert;
    }
    
    public static double anteil_unfallwagen(){
    	
    	double wert=0.0;
    	double counter=0.0;
    	Auto a ;
    	for (int i = 0; i < getAnzahl(); i++) {
			a= list.get(i);
			counter++;
			if(a.Unfallwagen){
				wert++;
			}
		}
    	
    	return 100/counter*wert;
    }

	

    public String toString() {
		return "---\n"+
				"Hersteller: " + this.Hersteller + "\n" + "Preis: " + this.Preis
				+ "\n" + "Motor: " + this.Leistung + "Ps (" + this.Kraftstoff
				+ ")\n" + "KM-Stand: " + this.Laufleistung + "\n" + "Farbe: "
				+ this.Frabe +((Unfallwagen==false)? "\nunfallfrei\n---":"\n---");
		
	}
	
	public static void bubbleSort() {
		boolean unsorted = true;
		Auto a;
		Auto b;
		
		while (unsorted) {
			unsorted = false;
			for (int i = 0; i < getAnzahl()-1; i++) {
			    
				a= list.get(i);
			    b= list.get(i+1);
				if (!(a.getPreis() >= b.getPreis())) {
				    Auto dummy = a;
					list.set(i, b);
					list.set(i+1,dummy);
					unsorted = true;
				}
			     
			}
		}
	}

}
