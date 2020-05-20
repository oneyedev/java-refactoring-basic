package design.creational.abstractfactory.factories;

import design.creational.abstractfactory.Coffee;
import design.creational.abstractfactory.CoffeeFactory;
import design.creational.abstractfactory.coffees.Americano;

public class AmericanoFactory implements CoffeeFactory{

	@Override
	public Coffee makeCoffee() {
		return new Americano();
	}

}
