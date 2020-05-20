package design.behavioral.visitor;

public class CoffeePlaceArea implements CoffeePlace{
	
	private CoffeePlace[] places;
	
	public CoffeePlaceArea(CoffeePlace... places) {
		this.places = places;
	}
	
	@Override
	public void accept(CoffeeVisitor visitor) {
		String name = visitor.getClass().getSimpleName();
		System.out.println(name + " 제조를 시작합니다.");
		for (CoffeePlace place : places) {
			place.accept(visitor);
		}
		System.out.println(name + " 제조가 끝났습니다.\n");
	}

}
