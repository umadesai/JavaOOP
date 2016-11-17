
public class AnimalTest {
	/**
	 * Creates a dog and cat object, sets sizes for each, and executes the makeNoise and isBigger methods.
	 * Creates a Dog of type Fetcher to confirm Dog implements Fetcher, and print the results of the fetch method.
	 */
	public static void main (String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.makeNoise();
		c.makeNoise();
		d.setSize(10);
		c.setSize(7);
		System.out.println(c.isBigger(d));
		Fetcher f = new Dog();
		System.out.println(f.fetch("ball"));
	}
}
