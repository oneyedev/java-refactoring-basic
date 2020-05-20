package design.creational.abstractfactory.factories;

import design.creational.abstractfactory.Coffee;
import design.creational.abstractfactory.CoffeeFactory;
import design.creational.abstractfactory.coffees.Espresso;

public class EspressoFactory implements CoffeeFactory{

	@Override
	public Coffee makeCoffee() {
		return new Espresso();
	}

}
