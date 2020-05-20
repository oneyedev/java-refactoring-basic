package design.behavioral.mediator.collegues;

import design.behavioral.mediator.Collegue;
import design.behavioral.mediator.Mediator;

public class Person extends Collegue{

	public Person(Mediator mediator) {
		super(mediator);
	}
	
	public void walk() {
		mediator.walk();
	}
	
	public void watchOut() {
		System.out.println("사람이 주변을 경계합니다.");
	}
}
