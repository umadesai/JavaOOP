package net.uma.huffman;

import java.io.*;

/**
 * @author udesai
 * Reads a file and returns the word count.
 */
public class WordCounter {
	private String file;
	private int counter;
	
	public WordCounter(String file){
		file = this.file;
	}
	
	public int WordCount(String file){
		try{
			File myFile = new File(file);
			FileReader fileReader = new FileReader(myFile);
			
			BufferedReader reader = new BufferedReader(fileReader);

			String line = null;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				String[] words = line.split(" ");
				counter += words.length;
			}
			reader.close();

		} catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println(counter);
		return counter;
	}
}