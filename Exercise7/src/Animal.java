/**
 * @author Uma Desai
 * Animal is a class with instance variables size and name, and methods makeNoise and isBigger.
 */
public abstract class Animal {
	private int size;
	private String name;
	
	public Animal() {
		System.out.println("Making an animal.");
	}
	public Animal(int size, String name) {
		this.size = size;
		this.name = name;
		System.out.println("Making an animal.");
	}
	/**
	 * Sets the instance variable size.
	 */
	public void setSize(int sz){
		this.size = sz;
	}
	/**
	 * Sets the instance variable name.
	 */
	public void setName(String nm){
		name = nm;
	}
	/**
	 * Returns the instance variable size.
	 */
	public int getSize(){
		return size;
	}
	/**
	 * Returns the instance variable name.
	 */
	public String getName(){
		return name;
	}
	/**
	 * Prints noise.
	 */
	public abstract void makeNoise();
	/**
	 * Takes an animal as argument and returns boolean for if the animal is bigger than its argument.
	 */
	public Boolean isBigger(Animal a) {
		return (a.size < size);
	}
}
