package uml.clazz.group.composition;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 사람은 내부에서 이름과 주소가 생성되어 관리됩니다(이름과 주소는 사람의 생명주기에 종속적).
		Person original = new Person();
		original.askWhoYouAre();
		
		// 복사가 일어날 경우, 이름과 주소는 사람의 생명주기에 종속적이기에 깊은 복사(deep copy), 즉 값 복사가 일어납니다.
		Person clone = (Person) original.clone();
		clone.askWhoYouAre();
		
		// 원본과 복사본이 각각 다른 객체를 참조하고 있기에 원본 참조객체의 값이 바뀌면, 복사본은 영향을 받지 않습니다.  
		original.getName().setValue("손흥민");
		original.getAddress().setValue("영국 런던");
		original.askWhoYouAre();
		clone.askWhoYouAre();
	}
}
