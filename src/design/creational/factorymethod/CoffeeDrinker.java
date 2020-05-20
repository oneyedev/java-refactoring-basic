package design.creational.factorymethod;

public abstract class CoffeeDrinker {

	private Coffee coffee;
	
	public CoffeeDrinker() {
		this.coffee = makeCoffee();
	}
	
	public void drink() {
		System.out.println(coffee.getClass().getSimpleName() + " 을 마십니다.");
	}
	
	public abstract Coffee makeCoffee();
}
