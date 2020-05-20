package uml.clazz.is.realization;

public class Student implements Personable{

	@Override
	public void askWhoYouAre() {
		System.out.println("저는 학생입니다.");
	}
}
