package uml.clazz.has.association;

public class App {
	public static void main(String[] args) {
		Person person = new Person("홍길동", new Address("서울시 강남구"));
		person.askAddress();
	}
}
