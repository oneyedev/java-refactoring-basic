package design.creational.factorymethod;

import design.creational.factorymethod.drinkers.AmericanoDrinker;
import design.creational.factorymethod.drinkers.EspressoDrinker;

public class App {

	public static void main(String[] args) {
		CoffeeDrinker americanoMaker = new AmericanoDrinker();
		americanoMaker.drink();
		
		CoffeeDrinker espressoMaker = new EspressoDrinker();
		espressoMaker.drink();
	}
}
