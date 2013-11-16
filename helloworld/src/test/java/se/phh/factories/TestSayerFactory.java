package se.phh.factories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSayerFactory {

	@Test
	public void testOfSingleton(){
		SayerFactory factory = SayerFactory.getInstance();
		SayerFactory factory_other = SayerFactory.getInstance();
		assertEquals("This is a singleton, there can be only one", factory,
				factory_other);
	}
}
