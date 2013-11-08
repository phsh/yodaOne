package se.phh.message;

public interface MessageContent {

	public static final StringBuilder DEFAULT = new StringBuilder(
			"Hello world!");

	StringBuilder getMessage();

	void setMessageValue(StringBuilder messageValue);
}
