package design.behavioral.visitor;

import design.behavioral.visitor.places.EspressoMachine;
import design.behavioral.visitor.places.MilkSteamer;
import design.behavioral.visitor.places.WaterHeater;
import design.behavioral.visitor.visitors.Americano;
import design.behavioral.visitor.visitors.Espresso;
import design.behavioral.visitor.visitors.Latte;

public class App {
	public static void main(String[] args) {
		CoffeeVisitor espresso = new Espresso();
		CoffeeVisitor americano = new Americano();
		CoffeeVisitor latte = new Latte();
		
		CoffeePlaceArea coffeeMaker = new CoffeePlaceArea(
			new EspressoMachine(), 
			new WaterHeater(), 
			new MilkSteamer()
		);
		
		coffeeMaker.accept(espresso);
		coffeeMaker.accept(americano);
		coffeeMaker.accept(latte);
	}
}
