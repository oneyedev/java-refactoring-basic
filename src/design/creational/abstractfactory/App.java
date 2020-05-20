package design.creational.abstractfactory;

import design.creational.abstractfactory.factories.AmericanoFactory;
import design.creational.abstractfactory.factories.EspressoFactory;

public class App {

	public static void main(String[] args) {
		CoffeeFactory americanoFactory = new AmericanoFactory();
		Coffee americano = americanoFactory.makeCoffee();
		americano.drink();
		
		CoffeeFactory espressoFactory = new EspressoFactory();
		Coffee espresso = espressoFactory.makeCoffee();
		espresso.drink();
	}
}
