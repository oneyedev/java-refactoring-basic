package uml.clazz.is.generalization;

public class App {
	public static void main(String[] args) {
		Person teacher = new Teacher();
		Person student = new Student();
		
		teacher.askWhoYouAre();
		student.askWhoYouAre();
	}
}
