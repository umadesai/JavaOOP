/**
 * @author Uma Desai
 * DogTestDrive creates an array of integer sizes and a DogPack, populates it
 * with one Dog for each size in the array, and then returns the biggest dog.
 */

public class DogTestDrive {
	public static void main (String[] args) {

		int[] sizeArray = {12, 11, 7};
		DogPack pack = new DogPack();
		pack.makeArray(sizeArray.length);

		for (int i = 0; i < sizeArray.length; i++) {
			Dog newDog = new Dog();
			newDog.setSize(sizeArray[i]);
			pack.addDog(i, newDog);
			// System.out.println(pack.getArray()[i]);
		}
		Dog big = pack.biggestDog();
		System.out.println("What is the size of the biggest dog? " + big.getSize());
	}
}