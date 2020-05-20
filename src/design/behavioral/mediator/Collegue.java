package design.behavioral.mediator;

public abstract class Collegue {

	protected Mediator mediator;
	private int position;
	
	public Collegue(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void moveTo(int goal) {
		position = goal;
		System.out.println(getClass().getSimpleName()+ "이(가) " + goal + "(으)로 움직입니다.");
	}

	public void talk(String message) {
		System.out.println(message);
	}
}
