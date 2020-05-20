package design.behavioral.state;

public class Person {

	private State state;
	private int stamina = 10;

	public void operation() {
		state.operation(this);
	}
	
	public State getState() {
		return state;
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public void increaseStamina() {
		this.stamina++;
	}
	
	public void decreaseStamina() {
		this.stamina--;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("현재상태는 %s이며, 스태미나는 %s입니다.", state.getClass().getSimpleName(), stamina);
	}
}
