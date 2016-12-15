package net.uma.huffman;
import java.util.HashMap;

/**
 * @author udesai
 *A Histogram represents a set of counters; that is, it counts the frequency of each element of the set.  
 *A natural implementation is a HashMap that maps from String elements to Integer counters.
 */
public class Histogram {
	/**
	 * This class implements a histogram.
	 */
	HashMap<Character,Integer> histogram;
	/**
	 * Initializes a new HashMap of given inputs.
	 */
	public Histogram() {
		histogram = new HashMap<Character,Integer>();
	}
	public String toString() {
	/**
	 * Returns a string representation of the Histogram for purposes of debugging.  
	 * (You can print out the state of an instance by printing the result of calling toString() on it.)	
	 */
		return histogram.toString();
	}
	public void count(Character ch) {
	/**
	* Increments the counter associated with the given character.
	*/
		if (histogram.containsKey(ch)){
			int count = histogram.get(ch)+1;
			histogram.put(ch, count);
		} else {
			histogram.put(ch, 1);
		}
	}
	public void count(String s) {
	/**
	* Iterates through the string and increments the counters for each letter.
	*/			

		for (int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);        
			count(ch);
		}
	}
	public int freq(Character ch){
	/**
	 * Returns the number of times the given character has occurred.
	 */
		if (histogram.containsKey(ch)){
			return histogram.get(ch);
		} else {
			return 0;
		}
}
//	}
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		 Histogram h = new Histogram();
//		 System.out.println(h.toString());
//	}

}
