package uml.clazz.is.realization;

public class App {
	public static void main(String[] args) {
		Personable teacher = new Teacher();
		Personable student = new Student();
		
		teacher.askWhoYouAre();
		student.askWhoYouAre();
	}
}
