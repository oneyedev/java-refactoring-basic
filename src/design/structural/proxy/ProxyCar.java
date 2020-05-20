package design.structural.proxy;

import design.structural.proxy.drivables.Car;

public class ProxyCar implements Drivable{

	private Driver driver; 
	private Drivable drivable;
	
	public ProxyCar(Driver driver) {
		this.driver = driver;
		this.drivable = new Car();
	}

	@Override
	public void drive() {
		if(driver.getAge() > 18) {
			drivable.drive();
		} else {
			System.out.println("만 18세가 넘어야 운전을 할 수 있습니다.");
		}
	}

}
