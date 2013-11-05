package se.phh.pools;

import java.util.List;
import java.util.ArrayList;

import se.phh.message.MessageContent;

public class MessageContentPool {
	private List<MessageContent> listOfMessageContent = new ArrayList<MessageContent>();

	public MessageContentPool() {
	}

	public void add(MessageContent messageContent) {
		listOfMessageContent.add(messageContent);
	}

	public List<MessageContent> get() {
		return listOfMessageContent;
	}
}