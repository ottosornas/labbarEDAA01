package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import set.ArraySet;
import set.MaxSet;
public class TestRemoveDuplicates {
	private MaxSet<Integer> s;
	int[] k;
	int[] b;
	int[] ktest;
	
	@Before	
	public void setUp() throws Exception {
		s = new MaxSet<Integer>();
	}
	
	@After
	public void tearDown() throws Exception {
		s = null;
	}
	
	@Test
	public final void testEmpty(){
		k = new int[]{};
		assertTrue("False for empty set", MaxSet.uniqueElements(k).length == 0);
	
	}
	
	@Test
	public final void testSame(){
		k = new int[]{7, 7, 7, 7, 7, 7};
		assertTrue("False if length is not one", MaxSet.uniqueElements(k).length == 1);
		
	}
	
	@Test
	public final void testDifferent(){
		k = new int[]{1,2,3,4,5,5,5,5,6,7,7,8,8};
		assertTrue("False if length is not 8", MaxSet.uniqueElements(k).length == 8);
		
	}
	@Test
	public final void testUnique(){
		k = new int[]{2,3,5,7};
		b = new int[]{2,2,2,3,5,5,7,3,7,7,7,5,5,5,2,2,7,7};
		ktest = MaxSet.uniqueElements(b);
		assertArrayEquals(k, ktest);
		
	}
	
}
