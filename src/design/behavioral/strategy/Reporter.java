package design.behavioral.strategy;

public class Reporter {
	private Personable personable;

	public Reporter(Personable personable) {
		this.personable = personable;
	}
	
	public void askWhoYouAre() {
		this.personable.askWhoYouAre();
	}
}
