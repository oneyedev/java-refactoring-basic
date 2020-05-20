package design.behavioral.observer;

public class Bath implements TimeListener{

	@Override
	public void onTimeout() {
		System.out.println("목욕물을 데웁니다.");
	}
}
