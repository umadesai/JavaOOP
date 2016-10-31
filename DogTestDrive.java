/**
 * @author Uma Desai
 * DogTestDrive creates an array of dogs, invokes bark on each dog,
 * finds the biggest dog, and prints its instance variables.
 */

class DogTestDrive {
	public static void main (String[] args) {

		Dog[] dogs;
		dogs = new Dog[3];
		dogs[0] = new Dog();
		dogs[0].size = 60;
		dogs[0].breed = "Great Dane";
		dogs[0].name = "Dan";
		dogs[1] = new Dog();
		dogs[1].size = 40;
		dogs[1].breed = "Labrador Retriever";
		dogs[1].name = "Lilly";
		dogs[2] = new Dog();
		dogs[2].size = 10;
		dogs[2].breed = "Chihuahua";
		dogs[2].name = "Charlie";

		int x = 0;
		int biggestDog = 0;
		while (x < dogs.length) {
			dogs[x].bark();
			if (dogs[x].size > dogs[biggestDog].size) {
				biggestDog = x;
			}
			if (x == 2) {
				System.out.println("Biggest dog: " + dogs[biggestDog].name + ", " + dogs[biggestDog].breed + ", " + dogs[biggestDog].size);
			}
			x = x + 1;
		}

	}
}