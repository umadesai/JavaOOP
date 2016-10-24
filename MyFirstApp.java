/**
 * @author Uma Desai
 * MyFirstApp executes example while loops, if statements, and
 * print statements that loop through values of z.
 */

public class MyFirstApp {
	public static void main (String[] args) {

        int z = 0;
        System.out.println("Getting ready to loop z through values up to 2");
        
        // example while loop
        while (z < 3) {
            System.out.println("z equals " + z);
            z = z + 1;
        }
        
        // example if statement
        if (z == 3) {
            System.out.println("Done with z");
        }
 }
}

