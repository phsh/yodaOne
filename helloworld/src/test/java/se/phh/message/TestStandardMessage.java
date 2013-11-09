package se.phh.message;

import org.junit.Test;

import se.phh.message.Standard;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestStandardMessage {

	@Test
	public void checkMessage() {
		Standard message = new Standard();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		assertEquals("This should be equal", messageContent,
				message.getMessage());
	}
	
	@Test
	public void checkNullMessage(){
		Standard message = new Standard();
		message.setMessageValue(null);
		assertNull("This should be null", message.getMessage());
		
	}
}
