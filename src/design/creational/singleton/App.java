package design.creational.singleton;

public class App {

	public static void main(String[] args) {
		Coffee.getInstance().drink();
		
		CoffeeEnum.Espresso.drink();
		CoffeeEnum.Americano.drink();
	}
}
