package se.phh.factories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import se.phh.message.MessageContent;
import se.phh.message.PrefixMessages;

public class MessageContentFactoryTest {

	@Test
	public void testOfSingleton() {
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContentFactory factory_other = MessageContentFactory
				.getInstance();
		assertEquals("This is a singleton, there can be only one", factory,
				factory_other);

	}

	@Test
	public void testGetMessageType_MESSAGE_TYPE_DEFAULT() {
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContent content = factory.getMessageType(
				MessageContentFactory.MESSAGE_TYPE_DEFAULT, new StringBuilder(
						"messageValue"));
		assertEquals("This should be equals", content.getMessage().toString(),
				"[1] messageValue");
	}

	@Test
	public void testGetMessageType_MESSAGE_TYPE_LOUD() {
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContent content = factory.getMessageType(
				MessageContentFactory.MESSAGE_TYPE_LOUD, new StringBuilder(
						"messageValue"));
		assertEquals("This should be equals", content.getMessage().toString(),
				PrefixMessages.LOUD + " messageValue");
	}

	@Test
	public void testGetMessageType_MESSAGE_TYPE_QUITE() {
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContent content = factory.getMessageType(
				MessageContentFactory.MESSAGE_TYPE_QUIET, new StringBuilder(
						"messageValue"));
		assertEquals("This should be equals", content.getMessage().toString(),
				PrefixMessages.QUITE + " messageValue");
	}

	@Test
	public void testGetMessageType_MESSAGE_TYPE_STANDARD() {
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContent content = factory.getMessageType(
				MessageContentFactory.MESSAGE_TYPE_STANDARD, new StringBuilder(
						"messageValue"));
		assertEquals("This should be equals", content.getMessage().toString(),
				"messageValue");
	}

	@Test
	public void testGetMessageType_MULIPLE() {
		MessageContentFactory factory = MessageContentFactory.getInstance();
		
		MessageContent content1 = factory.getMessageType(
				MessageContentFactory.MESSAGE_TYPE_STANDARD, new StringBuilder(
						"messageValue"));
		assertNotNull(content1);

		MessageContent content2 = factory.getMessageType(
				MessageContentFactory.MESSAGE_TYPE_QUIET, new StringBuilder(
						"messageValue"));
		assertNotNull(content2);

		MessageContent content3 = factory.getMessageType(
				MessageContentFactory.MESSAGE_TYPE_LOUD, new StringBuilder(
						"messageValue"));
		assertNotNull(content3);
		
		MessageContent content4 = factory.getMessageType(947295,
				new StringBuilder("messageValue"));
		assertNotNull(content4);

	}

}
