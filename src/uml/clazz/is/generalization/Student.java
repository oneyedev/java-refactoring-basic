package uml.clazz.is.generalization;

public class Student extends Person{

	@Override
	public void askWhoYouAre() {
		System.out.println("저는 학생입니다.");
	}
}
