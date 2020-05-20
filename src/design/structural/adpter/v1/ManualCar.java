package design.structural.adpter.v1;

public class ManualCar implements ManualDrivable{
	
	private int gear;
	
	@Override
	public int getGear() {
		return gear;
	}

	@Override
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
	@Override
	public void drive() {
		if(gear > 6) {
			System.err.printf("기어가 %s단입니다. 6단을 넘어가면 위험합니다.%n", gear);
		} else {
			System.out.printf("수동 차가 %s단으로 달립니다.%n", gear);
		}
	}
}
