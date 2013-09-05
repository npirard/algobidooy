package npi.algo;

import static org.junit.Assert.*;

import org.junit.Test;


public class QuickUnionTest {
	
	@Test
	public void testScenario(){
		QuickUnion instance = new QuickUnion(10);
		instance.union(1, 2);
		System.out.println(instance);
		instance.union(2, 3);
		System.out.println(instance);
	}

	@Test
	public void testConnected(){
		QuickUnion instance = new QuickUnion(2);
		assertFalse(instance.connected(0, 1));
		//simulate instance.union(0,1);
		instance.id[0] = 1;
		assertTrue(instance.connected(0, 1));
	}
	
	@Test
	public void testRoot(){
		int n = 10;
		QuickUnion instance = new QuickUnion(n);
		for(int i =0; i<n; i++){
			assertEquals(i, instance.root(i));
		}
		
		instance.id[2] = 1;
		assertEquals(1, instance.root(2));
		instance.id[3] = 2;
		assertEquals(1, instance.root(3));
	}
	
	@Test
	public void testUnion(){
		QuickUnion instance = new QuickUnion(4);
		instance.union(1,3);
		assertEquals("0 1 2 1", instance.toString());
	}
	
}
