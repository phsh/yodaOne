package se.phh.lists;

import java.util.List;
import java.util.ArrayList;

import se.phh.message.MessageContent;

public class MessageContentList {
	private List<MessageContent> listOfMessageContent = new ArrayList<MessageContent>();

	public MessageContentList() {
	}

	public void add(MessageContent messageContent) {
		listOfMessageContent.add(messageContent);
	}

	public List<MessageContent> get() {
		return listOfMessageContent;
	}
}
