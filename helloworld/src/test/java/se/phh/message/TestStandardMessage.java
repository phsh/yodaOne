package se.phh.message;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class TestStandardMessage {

	@Test
	public void verifyTheValueOfTheMessageContent() {
		Standard message = new Standard();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		
		assertNotSame("These Messages are not the same", messageContent, message.getMessage());
		
		assertEquals("This should be equal", messageContent.toString(),
				message.getMessage().toString());
	}
	
	@Test (expected=NullPointerException.class )
	public void checkNullMessage(){
		Standard message = new Standard();
		message.setMessageValue(null);
		message.getMessage();
	}
}
