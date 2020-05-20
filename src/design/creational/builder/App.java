package design.creational.builder;

public class App {

	public static void main(String[] args) {
		Coffee espresso = new CoffeeBuilder("케냐")
							.build();
		System.out.println(espresso);
		
		Coffee americano = new CoffeeBuilder("에디오피아")
							.boilWater(90)
							.build();
		System.out.println(americano);
		
		
		Coffee latte = new CoffeeBuilder("브라질")
							.boilWater(100)
							.steamingMilk()
							.build();
		System.out.println(latte);
	}
}
