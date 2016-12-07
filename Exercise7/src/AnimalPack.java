import java.util.ArrayList;

/**
 * @author Uma Desai
 * AnimalPack is a class with an instance variable that is an ArrayList of Animal objects.
 * It also has methods makeArray, getArray, addAnimal, biggestAnimal, and makeNoise.
 */

public class AnimalPack {
	
	public AnimalPack(){
		System.out.println("Making an animal pack.");
	}
	private ArrayList<Animal> animals;
	/**
	 * Takes an integer size and initializes animals to an array of Animals with the given size.
	 */
	public void makeArray () {
		animals = new ArrayList<Animal>();
	}
	/**
	 * Takes an integer index and an Animal and assigns the Animal to the Animal array at the given index.
	 */
	public void addAnimal (int i, Animal newAnimal) {
		animals.add(i, newAnimal);
	}
	/**
	 * Returns the biggest animal in the pack.
	 */
	public Animal biggestAnimal() {
		Animal biggest = animals.get(0);
		for (int i = 1; i < animals.size(); i++) {
			Animal anAnimal = animals.get(i);
			if (anAnimal.isBigger(biggest)) {
				biggest =  animals.get(i);
			}
		}
		return biggest;
	}
	/**
	 * Traverses the pack and invokes makeNoise on each Animal.
	 */
	public void makeNoise() {
		for (int i = 1; i < animals.size(); i++) {
			Animal anAnimal = animals.get(i);
			anAnimal.makeNoise();
		}
	}
	/**
	 * Returns the animals array.
	 */
	public ArrayList<Animal> getArray() {
		return animals;
	}
}
