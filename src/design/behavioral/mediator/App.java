package design.behavioral.mediator;

import java.util.Random;

import design.behavioral.mediator.collegues.Dog;
import design.behavioral.mediator.collegues.Person;
import design.behavioral.mediator.mediators.PetBehaviour;

public class App {
	public static void main(String[] args) throws InterruptedException {
		PetBehaviour behaviour = new PetBehaviour(3);
		Dog dog = new Dog(behaviour);
		Person person = new Person(behaviour);
		behaviour.setDog(dog);
		behaviour.setPerson(person);
		Random random = new Random();
		while(true) {
			Thread.sleep(1000);
			if(random.nextDouble() < 0.2) {
				dog.bark();
			} else {
				person.walk();
			}
		}
	}
}
