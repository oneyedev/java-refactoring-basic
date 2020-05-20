package design.behavioral.state;

import design.behavioral.state.states.Walking;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Person person = new Person();
		person.setState(new Walking());
		
		while(true) {
			Thread.sleep(500);
			person.operation();
			System.out.println(person);
		}
	}
}
