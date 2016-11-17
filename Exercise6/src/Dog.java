
public class Dog extends Animal implements Fetcher{
	/**
	 * Prints barking.
	 */
	public void makeNoise() {
		System.out.println("Ruff! Ruff!");
	}
	
	public String fetch(String s) {
		return "damp " + s;
	}
}
