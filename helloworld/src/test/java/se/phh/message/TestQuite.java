package se.phh.message;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestQuite {

	@Test
	public void test() {
		Quite message = new Quite();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		StringBuilder expectedMessage = new StringBuilder(PrefixMessages.QUITE)
				.append(' ').append(messageContent);
		assertEquals("This should be equal", expectedMessage.toString(),
				message.getMessage().toString());
	}

	@Test
	public void checkNullMessage() {
		Quite message = new Quite();
		StringBuilder expectedMessage = new StringBuilder(PrefixMessages.QUITE)
				.append(' ').append((String) null);
		message.setMessageValue(null);
		assertEquals("This should be equal", expectedMessage.toString(),
				message.getMessage().toString());
	}

}
