package se.phh;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestMessage{
	
	@Test
	public void checkMessage(){
		Message message = new Message("message");
		assertEquals("This should be equal", "message", message.getMessage());
	}
}
