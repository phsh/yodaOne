package se.phh.lists;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import se.phh.message.Loud;
import se.phh.message.MessageContent;
import se.phh.message.Quiet;
import se.phh.message.Standard;

public class TestMessageContentList {

	@Test
	public void testConstructor() {
		MessageContentList list = new MessageContentList();
		assertNotNull("You should be able to create lists", list);
		assertEquals("There should be zero elements", 0, list.get().size());
	}

	@Test
	public void testAddMessageContentAndRetrieve() {
		MessageContentList messageContentList = new MessageContentList();
		Loud setMessage = new Loud();
		messageContentList.add(setMessage);
		MessageContent getMessage = messageContentList.get().get(0);
		assertEquals("The same message", setMessage, getMessage);
		assertEquals("There ought to be only one", 1, messageContentList.get()
				.size());
	}
	
	@Test
	public void testAdd3MessageContentsAndRetrieve() {
		MessageContentList messageContentList = new MessageContentList();
		
		Loud setMessage1 = new Loud();
		Quiet setMessage2 = new Quiet();
		Standard setMessage3 = new Standard();
		
		messageContentList.add(setMessage1);
		messageContentList.add(setMessage2);
		messageContentList.add(setMessage3);
		
		MessageContent getMessage1 = messageContentList.get().get(0);
		MessageContent getMessage2 = messageContentList.get().get(1);
		MessageContent getMessage3 = messageContentList.get().get(2);
		
		assertEquals("The same message, 1", setMessage1, getMessage1);
		assertEquals("The same message, 2", setMessage2, getMessage2);
		assertEquals("The same message, 3", setMessage3, getMessage3);
		
		assertEquals("There ought to be only three", 3, messageContentList.get()
				.size());
		
		MessageContent getMessage2_again = messageContentList.get().get(1);
		assertEquals("The same message, again nr. 2", setMessage2, getMessage2_again);
	}

}
