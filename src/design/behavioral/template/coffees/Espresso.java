package design.behavioral.template.coffees;

import design.behavioral.template.Coffee;

public class Espresso extends Coffee{

	@Override
	protected void addHotWater() {
		System.out.println("에스프레소에는 뜨거운 물을 붓지 않습니다.");
	}

	@Override
	protected void addSteamMilk() {
		System.out.println("에스프레소에는 스팀밀크를 쓰지 않습니다.");
	}
}
