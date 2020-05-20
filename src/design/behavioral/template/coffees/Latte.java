package design.behavioral.template.coffees;

import design.behavioral.template.Coffee;

public class Latte extends Coffee{
	
	@Override
	protected void addHotWater() {
		System.out.println("라떼에 뜨거운 물을 붓습니다.");
	}

	@Override
	protected void addSteamMilk() {
		System.out.println("라떼에 스팀밀크를 추가합니다.");
	}
}
