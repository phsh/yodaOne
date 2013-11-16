package se.phh.factories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import se.phh.sayers.Sayer;

public class SayerFactoryTest {

	@Test
	public void testOfSingleton(){
		SayerFactory factory = SayerFactory.getInstance();
		SayerFactory factory_other = SayerFactory.getInstance();
		assertEquals("This is a singleton, there can be only one", factory,
				factory_other);
	}
	
	@Test
	public void testCreationOf(){
		SayerFactory factory = SayerFactory.getInstance();
		Sayer defaultSayer = factory.getSayer(SayerFactory.SAYER_DEFAULT);
		assertNotNull("This is createable" ,defaultSayer);
	}
}
