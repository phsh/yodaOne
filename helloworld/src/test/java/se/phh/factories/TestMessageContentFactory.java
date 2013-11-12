package se.phh.factories;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMessageContentFactory {
	
	@Test
	public void testGetInstance(){
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContentFactory factory_other = MessageContentFactory.getInstance();
		assertEquals("This is a singleton, there can be only one", factory,factory_other);
		
	}
}
