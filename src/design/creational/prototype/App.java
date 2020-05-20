package design.creational.prototype;

import design.creational.prototype.ingredients.Espresso;
import design.creational.prototype.ingredients.HotWater;
import design.creational.prototype.ingredients.SteamMilk;

public class App {

	public static void main(String[] args) {
		Coffee espresso = new Coffee(new Espresso("케냐"), null, null);
		System.out.println(espresso);
		
		Coffee americano = espresso.cloneCoffee();
		americano.setHotWater(new HotWater(90));
		System.out.println(americano);
		
		Coffee latte = espresso.cloneCoffee();
		latte.setHotWater(new HotWater(100));
		latte.setSteamMilk(new SteamMilk());
		System.out.println(latte);
				
	}
}
