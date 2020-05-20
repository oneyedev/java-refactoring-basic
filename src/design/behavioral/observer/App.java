package design.behavioral.observer;

public class App {
	public static void main(String[] args) {
		TimeListener person = new Person();
		TimeListener bath = new Bath();
		
		Timer timer = new Timer(5);
		timer.addListener(person);
		timer.addListener(bath);
		
		timer.start();
	}
}
