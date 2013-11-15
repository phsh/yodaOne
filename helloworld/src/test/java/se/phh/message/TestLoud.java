package se.phh.message;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class TestLoud {

	@Test
	public void test() {
		Loud message = new Loud();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		StringBuilder expectedMessage = new StringBuilder(PrefixMessages.LOUD)
				.append(' ').append(messageContent);
		assertEquals("This should be equal", expectedMessage.toString(),
				message.getMessage().toString());
	}

	@Test
	public void checkNullMessage() {
		Loud message = new Loud();
		message.setMessageValue(null);
		StringBuilder expectedMessage = new StringBuilder(PrefixMessages.LOUD)
				.append(' ').append((String) null);

		assertEquals("This should be equal", expectedMessage.toString(),
				message.getMessage().toString());
	}

	@Test
	public void checkImutabity() {
		StringBuilder setMessage = new StringBuilder("Some text");
		Loud message = new Loud();
		message.setMessageValue(setMessage);
		StringBuilder getMessage = message.getMessage();
		assertNotSame("This is another object", setMessage, getMessage);

		StringBuilder expectedMessage = new StringBuilder(PrefixMessages.LOUD)
				.append(' ').append(setMessage);
		assertEquals("This Value should be equal", expectedMessage.toString(),
				message.getMessage().toString());

		StringBuilder getMessageAgain = message.getMessage();
		assertNotSame("This is another for each call to the getMessage",
				getMessage, getMessageAgain);

	}

}
