package design.creational.factorymethod.drinkers;

import design.creational.factorymethod.Coffee;
import design.creational.factorymethod.CoffeeDrinker;
import design.creational.factorymethod.coffees.Espresso;

public class EspressoDrinker extends CoffeeDrinker{

	@Override
	public Coffee makeCoffee() {
		return new Espresso();
	}

}
