package uml.clazz.group.composition;

public class Person implements Cloneable{
	private Name name = new Name("홍길동");
	private Address address = new Address("서울시 강남구");
	
	public void askWhoYouAre() {
		System.out.printf("제 이름은 %s이며 사는 곳은 %s입니다.%n", name.getValue(), address.getValue());
	}
	
	public Name getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person clone = new Person();
		clone.name.setValue(this.name.getValue());
		clone.address.setValue(this.address.getValue());
		return clone;
	}
}
