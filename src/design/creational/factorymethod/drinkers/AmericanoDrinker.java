package design.creational.factorymethod.drinkers;

import design.creational.factorymethod.Coffee;
import design.creational.factorymethod.CoffeeDrinker;
import design.creational.factorymethod.coffees.Americano;

public class AmericanoDrinker extends CoffeeDrinker{

	@Override
	public Coffee makeCoffee() {
		return new Americano();
	}

}
