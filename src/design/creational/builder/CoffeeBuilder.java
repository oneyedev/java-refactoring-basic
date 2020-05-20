package design.creational.builder;

import design.creational.builder.ingredients.Espresso;
import design.creational.builder.ingredients.HotWater;
import design.creational.builder.ingredients.SteamMilk;

public class CoffeeBuilder {
	
	private Espresso espresso;
	private HotWater hotWater;
	private SteamMilk steamMilk;
	
	public CoffeeBuilder(String coffeeBeanName) {
		this.espresso = new Espresso(coffeeBeanName);
	}
	
	public CoffeeBuilder boilWater(int temperature) {
		this.hotWater = new HotWater(temperature);
		return this;
	}
	
	public CoffeeBuilder steamingMilk() {
		this.steamMilk = new SteamMilk();
		return this;
	}
	
	public Coffee build() {
		return new Coffee(espresso, hotWater, steamMilk);
	}
}
