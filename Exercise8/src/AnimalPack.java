import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Uma Desai
 * AnimalPack is a class with an instance variable that is an ArrayList of Animal objects.
 * It also has methods makeArray, getArray, addAnimal, biggestAnimal, makeNoise, and geoMean().
 */

public class AnimalPack{
	
	private ArrayList<Animal> animals;
	
	public AnimalPack(){
		System.out.println("Making an animal pack.");
	}
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
	/**
	 * Returns the geometric mean of the sizes of the animals.
	 */
	public double geoMean(){
		double geoSum = 1;
		for (Animal anAnimal: animals){
			geoSum = geoSum*anAnimal.getSize();
		}
		double geoMean = Math.pow(geoSum, 1.0/animals.size());
		return geoMean;
	}
	/**
	 * Static version of geoMean().
	 */
	public static double staticGeoMean(AnimalPack pack){
		double geoSum = 1;
		for (Animal anAnimal: pack.animals){
			geoSum = geoSum*anAnimal.getSize();
		}
		double geoMean = Math.pow(geoSum, 1.0/pack.animals.size());
		return geoMean;	
	}
	/**
	 * Uses Collections.sort to sort the Animal pack.
	 */
	void sortBySize(){
		Collections.sort(animals);
	}
	/**
	 * Implements Comparator and provides a compare method that compares Animals alphabetically by breed.
	 */
	public class CompareBreed implements Comparator<Animal>{
		public int compare(Animal one, Animal two){
			return one.getName().compareTo(two.getName());
		}
	}
	/**
	 * Uses Collections.sort and your comparator to sort the Animal pack.
	 */
	void sortByBreed(){
		CompareBreed breed = new CompareBreed();
		Collections.sort(animals, breed);
}
}
