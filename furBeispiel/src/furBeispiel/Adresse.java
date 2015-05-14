package furBeispiel;

public class Adresse {
	public String name;
	public String strasse;
	public int hausnummer;
	public int postleitzahl;
	public String wohnort;
	public String mail;
	
	
	// konstarktor
	public Adresse (String n,String s,int h){
		this.name = n;
		this.strasse = s;
		this.hausnummer = h;
	}
	
	public String toString(){
		return this.name + "\n" + this.strasse + "\n" + this.hausnummer;
	}
   public boolean equals(Adresse adr){
	   return this.name == adr.name &&
			   this.strasse== adr.strasse &&
			   this.hausnummer== adr.hausnummer;
   }


}
