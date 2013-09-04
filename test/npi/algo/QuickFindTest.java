package npi.algo;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickFindTest {

	@Test
	public void testConnected(){
		QuickFind instance = new QuickFind(2);
		assertFalse(instance.connected(0, 1));
		instance.id[1] = 0;
		assertTrue(instance.connected(0, 1));
	}
	
	@Test
	public void testUnion() throws Exception {
		QuickFind instance = new QuickFind(4);
		int idq = instance.id[1];
		int idp = instance.id[0];
		assertNotEquals(idp, idq);
		instance.union(0, 1);
		assertEquals(instance.id[0], idq);
		assertEquals(instance.id[1], idq);
		
		instance.union(2, 1);
		assertEquals(instance.id[2], idq);
		
		instance.union(1, 3);
		assertEquals(instance.id[0], 3);
		assertEquals(instance.id[1], 3);
		assertEquals(instance.id[2], 3);
	}

}
