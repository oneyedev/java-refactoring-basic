package uml.clazz.group.aggregation;

public class Person implements Cloneable{
	private Name name;
	private Address address;
	
	public Person(Name name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public Name getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void askWhoYouAre() {
		System.out.printf("제 이름은 %s이며 사는 곳은 %s입니다.%n", name.getValue(), address.getValue());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Person(name, address);
	}
}
