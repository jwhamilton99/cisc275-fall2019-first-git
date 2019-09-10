class Animal {
	String name;
	int numLegs;
	
	public Animal(String n, int l) {
		name = n;
		numLegs = l;
	}
	
	public int getLegs() {
		return numLegs;
	}
	@Override
	public String toString() {
		return ("("+name+","+numLegs+")");
	}
}

public class Dog extends Animal {
	public Dog(String n, int l) {
		super(n,l);
	}
	@Override
	public String toString() {
		return ("("+name+","+numLegs+")");
	}
}