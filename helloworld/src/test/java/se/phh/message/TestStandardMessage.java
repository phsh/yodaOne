package se.phh.message;

import org.junit.Test;

import se.phh.message.Standard;
import static org.junit.Assert.assertEquals;

public class TestStandardMessage {

	@Test
	public void checkMessage() {
		Standard message = new Standard();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
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
