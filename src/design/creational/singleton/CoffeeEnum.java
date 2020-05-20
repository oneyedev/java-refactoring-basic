package design.creational.singleton;

public enum CoffeeEnum {
	
	Espresso("에스프레소"),
	Americano("아메리카노");
	
	private String name;
	
	private CoffeeEnum(String name) {
		this.name = name;
	}
	
	public void drink() {
		System.out.println(name + " 을 마십니다.");
	}
}
