package design.structural.proxy;

public class App {

	public static void main(String[] args) {
		Drivable validCar = new ProxyCar(new Driver(20));
		validCar.drive();
		Drivable invalidCar = new ProxyCar(new Driver(15));
		invalidCar.drive();
	}

}
