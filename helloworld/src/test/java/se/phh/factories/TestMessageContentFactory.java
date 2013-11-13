package se.phh.factories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import se.phh.message.MessageContent;

public class TestMessageContentFactory {
	
	@Test
	public void testGetInstance(){
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContentFactory factory_other = MessageContentFactory.getInstance();
		assertEquals("This is a singleton, there can be only one", factory,factory_other);
		
	}
	
	@Test
	public void testGetMessageType_MESSAGE_TYPE_DEFAULT(){
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContent content = factory.getMessageType(MessageContentFactory.MESSAGE_TYPE_DEFAULT, new StringBuilder("messageValue"));
		assertEquals("This should be equals", content.getMessage().toString(),"[1] messageValue");
	}
	
	@Test
	public void testGetMessageType_MESSAGE_TYPE_LOUD(){
		MessageContentFactory factory = MessageContentFactory.getInstance();
		MessageContent content = factory.getMessageType(MessageContentFactory.MESSAGE_TYPE_LOUD, new StringBuilder("messageValue"));
		assertEquals("This should be equals", content.getMessage().toString(),"[LOUD] messageValue");
	}
}
