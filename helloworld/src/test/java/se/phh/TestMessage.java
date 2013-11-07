package se.phh;

import org.junit.Test;

import se.phh.message.Standard;
import static org.junit.Assert.assertEquals;
public class TestMessage{
	
	@Test
	public void checkMessage(){
		Standard message = new Standard();
		message.setMessageValue("message");
		assertEquals("This should be equal", "message", message.getMessage());
	}
}
