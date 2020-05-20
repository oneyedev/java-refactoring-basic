package design.behavioral.observer;

public class Person implements TimeListener{

	@Override
	public void onTimeout() {
		System.out.println("사람이 일어납니다.");
	}
}
