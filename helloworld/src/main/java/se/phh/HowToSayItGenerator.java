package se.phh;

import java.util.List;

import se.phh.sayers.Sayer;
import se.phh.sayers.SayerFactory;
import se.phh.sayers.SayerPool;

public class HowToSayItGenerator {
	private static HowToSayItGenerator instance = null;
	private static SayerFactory factory = SayerFactory.getInstance();
	private SayerPool pool;

	private HowToSayItGenerator() {
	}

	public static HowToSayItGenerator getInstance() {
		if (instance == null) {
			instance = new HowToSayItGenerator();
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
