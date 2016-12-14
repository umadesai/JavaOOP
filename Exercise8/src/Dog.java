
public class Dog extends Animal implements Fetcher{
	/**
	 * Prints barking.
	 */
	public Dog() {
		super();
		System.out.println("Making a dog.");
	}
	public Dog(int size, String name) {
		super(size, name);
		System.out.println("Making a dog.");
	}
	public void makeNoise() {
		System.out.println("Ruff! Ruff!");
	}
	
	public String fetch(String s) {
		return "damp " + s;
	}
}
