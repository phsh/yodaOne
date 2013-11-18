package se.phh.lists;

import java.util.ArrayList;
import java.util.List;

import se.phh.sayers.Sayer;

public class SayerList {

	private List<Sayer> sayerList = new ArrayList<Sayer>();

	public SayerList() {
	}

	public void add(Sayer sayer) {
		sayerList.add(sayer);
	}

	public List<Sayer> get() {
		return sayerList;
	}
}
