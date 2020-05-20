package design.behavioral.state.states;

import design.behavioral.state.Person;
import design.behavioral.state.State;

public class Walking implements State{

	@Override
	public void operation(Person person) {
		person.decreaseStamina();
		if(person.getStamina() <= 0) {
			person.setState(new Rest());
		}
	}
}
