package se.phh.world.generators;

import java.util.List;

import se.phh.factories.SayerFactory;
import se.phh.lists.SayerList;
import se.phh.sayers.Sayer;

public class SayerGenerator implements Generator<Sayer> {
	private static SayerGenerator instance = null;
	private static SayerFactory factory = SayerFactory.getInstance();
	private SayerList pool;

	private SayerGenerator() {
	}

	public static SayerGenerator getInstance() {
		if (instance == null) {
			instance = new SayerGenerator();
			instance.populate();
		}
		return instance;
	}

	private void populate() {
		pool = new SayerList();
		pool.add(factory.getSayer(SayerFactory.SAYER_OUT));
		pool.add(factory.getSayer(SayerFactory.SAYER_ERR));
		pool.add(factory.getSayer(SayerFactory.SAYER_JUL));
	}

	public List<Sayer> get() {
		return pool.get();
	}
}
