package furBeispiel;



public class FriendlyPerson {
	public String name;

	public FriendlyPerson(String n) {
		this.name = n;
	}

	public void sayHello() {
		System.out.println("[" + this + "]: Hi, I am " + this);
	}

	public String toString() {
		return name;
	}
}
