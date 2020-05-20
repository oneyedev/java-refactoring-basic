package design.behavioral.template;

import design.behavioral.template.coffees.Americano;
import design.behavioral.template.coffees.Espresso;
import design.behavioral.template.coffees.Latte;

public class App {
	public static void main(String[] args) {
		Coffee espresso = new Espresso();
		Coffee americano = new Americano();
		Coffee latte = new Latte();
		
		espresso.make();
		americano.make();
		latte.make();
	}
}
