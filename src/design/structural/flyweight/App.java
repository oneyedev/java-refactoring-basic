package design.structural.flyweight;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Coffee espresso = CoffeeFactory.intern("에스프레소");
		Coffee americano = CoffeeFactory.intern("아메리카노");
		Coffee americano2 = CoffeeFactory.intern("아메리카노");
		espresso.drink();
		americano.drink();
		americano2.drink();
		System.out.println(CoffeeFactory.cacheInfo());
		System.gc();
		Thread.sleep(1000);
		System.out.println(CoffeeFactory.cacheInfo());
		
	}
	

}
