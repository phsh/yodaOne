package se.phh.message;

import org.junit.Test;

import se.phh.message.Standard;
import static org.junit.Assert.assertEquals;

public class TestMessage {

	@Test
	public void checkMessage() {
		Standard message = new Standard();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		assertEquals("This should be equal", messageContent,
				message.getMessage());
	}
}
