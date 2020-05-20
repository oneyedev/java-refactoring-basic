package design.structural.adpter.v2;

public class AutoCar implements AutoDrivable{

	@Override
	public void drive() {
		System.out.printf("새 차가 자동으로 달립니다.%n");
	}
}
