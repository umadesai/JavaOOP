
public class AnimalTest {
//	Modify AnimalTest.java so that Animal is an abstract class that requires subclasses to override makeNoise().  
//	Try to instantiate an Animal and confirm that you can't.  Test the new version and check it in.
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
