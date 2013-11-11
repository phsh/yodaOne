package se.phh.message;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestQuite {

	@Test
	public void test() {
		Quite message = new Quite();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		assertEquals("This should be equal", ("[QUITE] " + messageContent),
				message.getMessage().toString());
	}

	@Test
	public void checkNullMessage(){
		Quite message = new Quite();
		message.setMessageValue(null);
		assertEquals("This should be equal","[QUITE] null", message.getMessage().toString());
	}
	
}


