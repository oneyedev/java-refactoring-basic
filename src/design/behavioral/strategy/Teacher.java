package design.behavioral.strategy;

public class Teacher implements Personable{

	@Override
	public void askWhoYouAre() {
		System.out.println("저는 선생입니다.");
	}
}
