package se.phh.message;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestLoud {

	@Test
	public void test() {
		Loud message = new Loud();
		StringBuilder messageContent = new StringBuilder("message");
		message.setMessageValue(messageContent);
		assertEquals("This should be equal", ("[LOUD] " + messageContent).toString(),
				message.getMessage().toString());
	}

	@Test
	public void checkNullMessage(){
		Loud message = new Loud();
		message.setMessageValue(null);
		assertEquals("This should be equal","[LOUD] null", message.getMessage().toString());
	}
	
}


