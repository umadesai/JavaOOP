
public class Cat extends Animal {
	/**
	 * Prints meowing.
	 */
	public Cat() {
		super();
		System.out.println("Making a cat.");
	}
	public Cat(int size, String name) {
		super(size, name);
		System.out.println("Making a cat.");
	}
	public void makeNoise() {
		System.out.println("Meow! Meoooooooow!");
	}
}
