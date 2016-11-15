/**
 * @author Uma Desai
 * AnimalTest creates an array of integer sizes and an AnimalPack, populates it
 * with one Animal for each size in the array, returns the biggest animal, and 
 * executes the makeNoise on each animal in the pack.
 */
public class AnimalPackTest {

	public static void main (String[] args) {

		int[] sizeArray = {12, 11, 7};
		AnimalPack pack = new AnimalPack();
		pack.makeArray();

		for (int i = 0; i < sizeArray.length; i++) {
			Animal newAnimal = null;
			if (Math.random() < 0.5) {
				newAnimal = new Dog();
			} else {
				newAnimal = new Cat();
			}
			newAnimal.setSize(sizeArray[i]);
			pack.addAnimal(i, newAnimal);
			pack.makeNoise();

		}
		Animal big = pack.biggestAnimal();
		System.out.println("What is the size of the biggest animal? " + big.getSize());
	}
}