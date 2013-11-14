package se.phh.lists;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import se.phh.message.Loud;
import se.phh.message.MessageContent;

public class TestMessageContentList {

	@Test
	public void testConstructor(){
		MessageContentList list = new MessageContentList();
		assertNotNull("You should be able to create lists",list);
	}
	
	@Test
	public void testAddMessageContentAndRetrieveIt(){
		MessageContentList messageContentList = new MessageContentList();
		Loud setMessage = new Loud();
		messageContentList.add(setMessage);
		MessageContent getMessage = messageContentList.get().get(0);
		assertEquals("The same message",setMessage,getMessage);
		assertEquals("There ought to be only one",1,messageContentList.get().size());
	}
	
}
