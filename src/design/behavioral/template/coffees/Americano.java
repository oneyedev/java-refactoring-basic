package design.behavioral.template.coffees;

import design.behavioral.template.Coffee;

public class Americano extends Coffee{
	
	@Override
	protected void addHotWater() {
		System.out.println("뜨거운 물을 넣습니다.");
	}

	@Override
	protected void addSteamMilk() {
		System.out.println("아메리카노에는 스팀밀크를 쓰지 않습니다.");
	}
}
