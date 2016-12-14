public class AnimalTest {
	/**
	 * Creates a dog and cat object, sets sizes for each, and executes the makeNoise and isBigger methods.
	 * Creates a Dog of type Fetcher to confirm Dog implements Fetcher, and print the results of the fetch method.
	 */
	public static void main (String[] args) {
		Dog d = new Dog(10, "leo");
		Cat c = new Cat(7, "kitkat");
		d.makeNoise();
		c.makeNoise();
		System.out.println(d.getSize());
		System.out.println(c.getName());
		System.out.println(c.isBigger(d));
		Fetcher f = new Dog();
		System.out.println(f.fetch("ball"));
		System.out.println(d.compareTo(c));
	}
}
