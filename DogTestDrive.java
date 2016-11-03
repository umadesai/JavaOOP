/**
 * @author Uma Desai
 * DogTestDrive tests the getSize, setSize, and isBigger methods of the Dog class.
 */

class DogTestDrive {
	public static void main (String[] args) {

		Dog dog = new Dog();
		dog.setSize(40);
		Dog dog2 = new Dog();
		dog2.setSize(60);
		System.out.println(dog.isBigger(dog2));

	}
}

class Dog {
	private int size;
	String breed;
	String name;

	public void setSize(int sz){
		size = sz;
	}

	public int getSize(){
		return size;
	}

	public boolean isBigger(Dog d) {
		return d.getSize() > size;
	}

	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}