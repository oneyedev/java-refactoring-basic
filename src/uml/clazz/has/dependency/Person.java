package uml.clazz.has.dependency;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public void askAddress(Address address) {
		System.out.printf("%s : %s의 주소는 %s입니다.%n", getClass().getPackageName(), name, address.getValue());
	}
}
