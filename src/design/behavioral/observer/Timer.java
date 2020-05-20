package design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Timer{

	private int second;
	private List<TimeListener> listeners = new ArrayList<>();
	
	public Timer(int time) {
		this.second = time;
	}
	
	public void addListener(TimeListener listener) {
		this.listeners.add(listener);
	}

	public void start() {
		try {
			waitUntilTimeout();
			notifyListeners();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void waitUntilTimeout() throws InterruptedException {
		while(second > 0) {
			System.out.println(second);
			second--;
			Thread.sleep(1000);
		}
	}

	private void notifyListeners() {
		for (TimeListener listener : listeners) {
			listener.onTimeout();
		}
	}
}
