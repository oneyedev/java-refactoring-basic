package design.structural.adpter.v1;

public class App {

	public static void main(String[] args) {
		ManualCar car = new ManualCar();
		car.setGear(1);
		car.drive();
		car.setGear(2);
		car.drive();
		car.setGear(3);
		car.drive();
		car.setGear(8);
		car.drive();
	}
}
