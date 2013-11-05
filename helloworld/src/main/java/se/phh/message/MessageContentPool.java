package se.phh.message;

import java.util.List;
import java.util.ArrayList;

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
