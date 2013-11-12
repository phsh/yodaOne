package se.phh.lists;

import java.util.ArrayList;
import java.util.List;

import se.phh.sayers.Sayer;

public class SayerList {

	private List<Sayer> listOfSayers = new ArrayList<Sayer>();

	public SayerList() {
	}

	public void add(Sayer s) {
		listOfSayers.add(s);
	}

	public List<Sayer> get() {
		return listOfSayers;
	}
}
