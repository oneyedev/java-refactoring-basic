package uml.clazz.has.association;

public class Person {
	private String name;
	private Address address;
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public void askAddress() {
		System.out.printf("%s : %s의 주소는 %s입니다.%n", getClass().getPackageName(), name, address.getValue());
	}
}
