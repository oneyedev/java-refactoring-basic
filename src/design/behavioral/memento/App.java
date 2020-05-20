package design.behavioral.memento;

import design.behavioral.memento.Person.Memento;

public class App {
	public static void main(String[] args) {
		Person person = new Person();
		person.setState("잠을 자고있습니다.");
		System.out.println(person);
		
		Memento memento = person.createMemento();
		person.setState("일을 합니다.");
		System.out.println(person);
		
		person.restoreMemento(memento);
		System.out.println(person);
	}
}
