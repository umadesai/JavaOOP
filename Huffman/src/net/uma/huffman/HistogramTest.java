package net.uma.huffman;

import org.junit.Test;
import static org.junit.Assert.*;

public class HistogramTest {
	@Test
	public void testToString(){
		Histogram h = new Histogram();
		h.count("The quick brown fox jumps over the lazy dog.");
		assertTrue(h.toString() instanceof String);
		
	}
	@Test
	public void testCountCh() {
		Histogram h = new Histogram();
		h.count('z');
		assertEquals("testCountCh", 1, h.freq('z'));
	}
	
	@Test
	public void testCountS(){
		Histogram h = new Histogram();
		h.count("The quick brown fox jumps over the lazy dog.");
		assertEquals("testCountS", 4, h.freq('o'));
	}
	
	@Test
	public void testFreq(){
		Histogram h = new Histogram();
		h.count("The quick brown fox jumps over the lazy dog.");
		
		assertEquals("testFreq", 4, h.freq('o'));
}
}
