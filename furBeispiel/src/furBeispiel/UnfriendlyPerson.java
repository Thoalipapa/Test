package furBeispiel;


public class UnfriendlyPerson {
	public String name;

	public UnfriendlyPerson(String n) {
		this.name = n;
	}

	public void sayHello() {
		System.out.println("[" + this + "]: Go away. I am busy.");
	}

	public String toString() {
		return name;
	}
}