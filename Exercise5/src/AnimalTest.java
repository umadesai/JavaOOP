
public class AnimalTest {
	public static void main (String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.makeNoise();
		c.makeNoise();
		d.setSize(10);
		c.setSize(7);
		System.out.println(c.isBigger(d));
	}
}
