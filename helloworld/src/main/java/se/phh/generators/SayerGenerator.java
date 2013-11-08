package se.phh.generators;

import java.util.List;

import se.phh.factories.SayerFactory;
import se.phh.pools.SayerPool;
import se.phh.sayers.Sayer;

public class SayerGenerator {
	private static SayerGenerator instance = null;
	private static SayerFactory factory = SayerFactory.getInstance();
	private SayerPool pool;

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
		pool = new SayerPool();
		pool.add(factory.getSayer(SayerFactory.SAYER_OUT));
		pool.add(factory.getSayer(SayerFactory.SAYER_ERR));
		pool.add(factory.getSayer(SayerFactory.SAYER_JUL));
	}

	public List<Sayer> get() {
		return pool.get();
	}
}
