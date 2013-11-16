package se.phh.message;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class QuietTest {

	@Test
	public void test() {
		Quiet message = new Quiet();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		StringBuilder expectedMessage = new StringBuilder(PrefixMessages.QUITE)
				.append(' ').append(messageContent);
		assertEquals("These values should be equal", expectedMessage.toString(),
				message.getMessage().toString());
		
		assertNotSame("Not the same object", expectedMessage, message.getMessage());
	}

	@Test
	public void checkNullMessage() {
		Quiet message = new Quiet();
		StringBuilder expectedMessage = new StringBuilder(PrefixMessages.QUITE)
				.append(' ').append((String) null);
		message.setMessageValue(null);
		assertEquals("This should be equal", expectedMessage.toString(),
				message.getMessage().toString());
	}

}
