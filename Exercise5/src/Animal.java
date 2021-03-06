/**
 * @author Uma Desai
 * Animal is a class with instance variables size and name, and methods makeNoise and isBigger.
 */
public class Animal {
	private int size;
	private String name;
	
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
	void makeNoise() {
		System.out.println("Animal making noise!");
	}
	/**
	 * Takes an animal as argument and returns boolean for if the animal is bigger than its argument.
	 */
	public Boolean isBigger(Animal a) {
		return (a.size < size);
	}
}
