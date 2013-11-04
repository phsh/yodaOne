package se.phh.util;

public class Timer {
	private long startTime = 0;
	private long totalTime = 0;
	private String clazz = null;

	public Timer(String _clazzName) {
		clazz = _clazzName;
	}

	public void resetTimer() {
		totalTime = 0;
		startTime = 0;
	}

	public void startTimer() {
		startTime = System.currentTimeMillis();
	}

	public long stopTime() {
		totalTime = totalTime + (System.currentTimeMillis() - startTime);
		return totalTime;
	}

	public String toString() {
		return "Totaltime [ " + clazz + " ] " + totalTime + " ms";
	}
}
