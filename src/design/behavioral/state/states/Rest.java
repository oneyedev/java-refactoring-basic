package design.behavioral.state.states;

import design.behavioral.state.Person;
import design.behavioral.state.State;

public class Rest implements State{

	@Override
	public void operation(Person person) {
		person.increaseStamina();
		if(person.getStamina() >= 10) {
			person.setState(new Walking());
		}
	}
}
