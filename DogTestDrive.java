/**
 * @author Uma Desai
 * DogTestDrive creates an array of integer sizes and a DogPack, populates it
 * with one Dog for each size in the array, and then returns the biggest dog.
 */

class DogTestDrive {
	public static void main (String[] args) {

		int[] sizeArray = {12, 11, 7};
		DogPack pack = new DogPack();
		pack.makeArray(sizeArray.length);

		for (int i = 0; i < sizeArray.length; i++) {
			int newSize = sizeArray[i];
			Dog newDog = new Dog();
			newDog.setSize(newSize);
			pack.addDog(i, newDog);
			// System.out.println(pack.getArray()[i]);
		}
		Dog big = pack.biggestDog();
		System.out.println("What is the size of the biggest dog? " + big.getSize());
	}
}


/**
 * @author Uma Desai
 * Dog is a class with instance variables size, breed, and name, and methods isBigger and bark.
 */

class Dog {
	private int size;
	private String breed;
	private String name;
/**
 * Sets the instance variable size.
 */
	public void setSize(int sz){
		this.size = sz;
	}
/**
 * Sets the instance variable breed.
 */
	public void setBreed(String bd){
		breed = bd;
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
 * Returns the instance variable breed.
 */
	public String getBreed(){
		return breed;
	}
/**
 * Returns the instance variable name.
 */
	public String getName(){
		return name;
	}
/**
 * Returns a boolean indicating whether the inputed Dog is bigger than the original Dog.
 */
	public boolean isBigger(Dog d) {
		return d.getSize() < size;
	}
/**
 * Prints barking.
 */
	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}

/**
 * @author Uma Desai
 * DogPack is a class with an instance variable that is an array of Dog objects.
 * It also has methods makeArray, getArray, addDog, and biggestDog.
 */
class DogPack {
	private Dog[] dogs;
/**
 * Takes an integer size and initializes dogs to an array of Dogs with the given size.
 */
	public void makeArray (int size) {
		dogs = new Dog[size];
	}
/**
 * Takes an integer index and a Dog and assigns the Dog to the Dog array at the given index.
 */
	public void addDog (int i, Dog newDog) {
		dogs[i] = newDog;
	}
/**
 * Returns the biggest dog in the pack.
 */
	public Dog biggestDog() {
		Dog biggest = new Dog();
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i].isBigger(biggest)) {
				biggest = dogs[i];
			}
		}
		return biggest;
	}

/**
 * Returns the dogs array.
 */
	public Dog[] getArray() {
		return dogs;
	}
}