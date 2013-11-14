package se.phh.lists;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestMessageContentList {

	@Test
	public void testConstructor(){
		MessageContentList list = new MessageContentList();
		assertNotNull("You should be able to create lists",list);
	}
	

}
