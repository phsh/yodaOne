package se.phh.lists;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SayerListTest {
	
	@Test
	public void testConstructor() {
		SayerList sayerList = new SayerList();
		assertNotNull("You should be able to create lists", sayerList);
		assertEquals("There should be zero elements", 0, sayerList.get().size());
	}

}
