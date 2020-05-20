package design.behavioral.strategy;

public class App {
	public static void main(String[] args) {
		Reporter reporter;
		
		reporter = new Reporter(new Teacher());
		reporter.askWhoYouAre();
		
		reporter = new Reporter(new Student());
		reporter.askWhoYouAre();
	}
}
