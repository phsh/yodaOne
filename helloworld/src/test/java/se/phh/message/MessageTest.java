package se.phh.message;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageTest {
	@Test
	public void testAbstractVersion() {
		Message message = new TestAbstractMessage();
		message.setMessageValue(new StringBuilder("messageValue"));
		assertEquals("This should be equal", "messageValue", message
				.getMessage().toString());
	}
}

class TestAbstractMessage extends Message {

	public StringBuilder getMessage() {

		return super.getMessageValue();
	}

}