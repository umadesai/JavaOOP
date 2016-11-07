import java.util.ArrayList;

/**
 * @author Uma Desai
 * DogPack is a class with an instance variable that is an array of Dog objects.
 * It also has methods makeArray, getArray, addDog, and biggestDog.
 */
public class DogPack {
	private ArrayList<Dog> dogs;
/**
 * Takes an integer size and initializes dogs to an array of Dogs with the given size.
 */
	public void makeArray (int size) {
		dogs = new ArrayList<Dog>(size);
	}
/**
 * Takes an integer index and a Dog and assigns the Dog to the Dog array at the given index.
 */
	public void addDog (int i, Dog newDog) {
		dogs.add(i, newDog);
	}
/**
 * Returns the biggest dog in the pack.
 */
	public Dog biggestDog() {
		Dog biggest = new Dog();
		for (int i = 0; i < dogs.size(); i++) {
			Dog aDog = dogs.get(i);
			if (aDog.isBigger(biggest)) {
				biggest =  dogs.get(i);
			}
		}
		return biggest;
	}

/**
 * Returns the dogs array.
 */
	public ArrayList<Dog> getArray() {
		return dogs;
	}
}