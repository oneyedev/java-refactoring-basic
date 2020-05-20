package design.behavioral.mediator.collegues;

import design.behavioral.mediator.Collegue;
import design.behavioral.mediator.Mediator;

public class Dog extends Collegue{

	public Dog(Mediator mediator) {
		super(mediator);
	}
	
	public void bark() {
		mediator.bark();
	}
	
	public void walwal() {
		System.out.println("왈왈!");
	}

	

}
