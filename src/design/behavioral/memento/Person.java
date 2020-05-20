package design.behavioral.memento;

public class Person{

	private String state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}
	
	public class Memento{
		private final String copyedState;

		public Memento(String copyedState) {
			this.copyedState = copyedState;
		}

		public String getState() {
			return copyedState;
		}
	}

	@Override
	public String toString() {
		return String.format("Person [state=%s]", state);
	}
}
