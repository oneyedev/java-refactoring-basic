package uml.clazz.has.dependency;

public class App {
	public static void main(String[] args) {
		Person person = new Person("홍길동");
		person.askAddress(new Address("서울시 강남구"));
	}
}
