
public abstract class Animal {

	protected String name; // inheritance
	protected int legs; // inheritance
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void Properties() {
		System.out.println("legs " + legs);
		System.out.println("name " + name);
		
	}
	
	public abstract void makeSound();
	public abstract void Smell();
	
}
