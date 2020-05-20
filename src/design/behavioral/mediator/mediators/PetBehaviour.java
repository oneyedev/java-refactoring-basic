package design.behavioral.mediator.mediators;

import design.behavioral.mediator.Mediator;
import design.behavioral.mediator.collegues.Dog;
import design.behavioral.mediator.collegues.Person;

public class PetBehaviour implements Mediator{

	private Person person;
	private Dog dog;
	
	private int distance;
	
	public PetBehaviour(int distance) {
		super();
		this.distance = distance;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public void walk() {
		person.moveTo(person.getPosition() + 1);
		int p1 = person.getPosition();
		int p2 = dog.getPosition();
		if(Math.abs(p1 - p2) > distance) {
			dog.moveTo(p1);
		}
	}

	@Override
	public void bark() {
		dog.walwal();
		person.watchOut();
	}
}
