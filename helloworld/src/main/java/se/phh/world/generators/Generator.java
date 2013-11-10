package se.phh.world.generators;

import java.util.List;

public interface Generator<E> {
	List<E> get();
}