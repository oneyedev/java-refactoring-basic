package uml.clazz.group.aggregation;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 이름과 주소는 사람 객체와 별도로 생성되서 관리됩니다.(생명주기가 독립적)
		Name name = new Name("홍길동");
		Address address = new Address("서울시 강남구");
		
		// 사람은 외부에서 이름과 주소를 주입 받습니다.
		Person original = new Person(name, address);
		original.askWhoYouAre();
		
		// 복사가 일어날 경우, 이름과 주소는 사람의 생명주기와 독립적이기에 얕은 복사(swallow copy), 즉 객체 참조 복사가 일어납니다.
		Person clone = (Person) original.clone();
		clone.askWhoYouAre();
		
		// 원본과 복사본이 같은 객체를 참조하고 있기에 참조객체의 값이 바뀌면 원본과 복사본이 모두 바뀝니다.
		original.getName().setValue("손흥민");
		original.getAddress().setValue("영국 런던");
		original.askWhoYouAre();
		clone.askWhoYouAre();
	}
}
