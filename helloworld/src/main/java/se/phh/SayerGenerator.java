package se.phh;

import java.util.List;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerFactory;
import se.phh.sayers.SayerPool;

public class SayerGenerator {
	private static SayerGenerator instance = null;
	private static SayerFactory factory = SayerFactory.getInstance();
	private SayerPool pool;

	private SayerGenerator() {
	}

	public static SayerGenerator getInstance() {
		if (instance == null) {
			instance = new SayerGenerator();
			instance.init();
		}
		return instance;
	}

	private void init() {
		pool = new SayerPool();
		pool.add(factory.getSayer(SayerFactory.SAYER_OUT));
		pool.add(factory.getSayer(SayerFactory.SAYER_ERR));
		pool.add(factory.getSayer(SayerFactory.SAYER_JUL));
	}

	public List<Sayer> getSayers() {
		return pool.get();
	}
}
