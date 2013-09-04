package npi.algo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class WeightedQuickUnionTest {

	@Test
	public void scenario(){
		WeightedQuickUnion instance = new WeightedQuickUnion(10);
		//9-5 6-0 5-2 4-7 5-3 2-1 7-8 4-6 2-6
		instance.union(9, 5);
		instance.union(6, 0);
		instance.union(5, 2);
		instance.union(4, 7);
		instance.union(5, 3);
		instance.union(2, 1);
		instance.union(7, 8);
		instance.union(4, 6);
		instance.union(2, 6);
		System.out.println(instance);
	}
	@Test
	public void testRoot(){
		int n = 10;
		WeightedQuickUnion instance = new WeightedQuickUnion(n);
		for(int i =0; i<n; i++){
			assertEquals(i, instance.root(i));
		}
		
		instance.id[2] = 1;
		assertEquals(1, instance.root(2));
		instance.id[3] = 2;
		assertEquals(1, instance.root(3));
	}
	
	@Test
	public void testConnected(){
		WeightedQuickUnion instance = new WeightedQuickUnion(2);
		assertFalse(instance.connected(0, 1));
		//simulate instance.union(0,1);
		instance.id[0] = 1;
		assertTrue(instance.connected(0, 1));
	}
	
	@Test
	public void testUnion(){
		WeightedQuickUnion instance = new WeightedQuickUnion(4);
		instance.union(1,3);
		assertEquals("0 1 2 1 | 1 2 1 1", instance.toString());
		assertEquals(2, instance.sz[1]);
		assertEquals(2, instance.sz[instance.root(3)]);
	}
}
