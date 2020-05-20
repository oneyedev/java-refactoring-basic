package design.structural.adpter.v2;

import design.structural.adpter.v1.ManualCar;

public class App {

	public static void main(String[] args) {
		AutoDrivable[] autoCars = {new AutoCar(), new ManualToAutoAdapter(new ManualCar())};
		for (AutoDrivable autoCar : autoCars) {
			autoCar.drive();
		}
	}
}
