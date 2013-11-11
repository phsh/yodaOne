package se.phh.message;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLoud {

	@Test
	public void test() {
		Loud message = new Loud();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		StringBuilder whatIfShouldBe = new StringBuilder(PrefixMessages.LOUD)
				.append(' ').append(messageContent);
		assertEquals("This should be equal", whatIfShouldBe.toString(), message
				.getMessage().toString());
	}

	@Test
	public void checkNullMessage() {
		Loud message = new Loud();
		message.setMessageValue(null);
		StringBuilder whatIfShouldBe = new StringBuilder(PrefixMessages.LOUD)
		.append(' ').append((String)null);
		
		assertEquals("This should be equal", whatIfShouldBe.toString(), message
				.getMessage().toString());
	}

}
