package design.behavioral.visitor.visitors;

import design.behavioral.visitor.CoffeeVisitor;

public class Americano implements CoffeeVisitor{
	
	@Override
	public void visitEspressoMachine() {
		System.out.println("에스프레소를 추출합니다.");
	}

	@Override
	public void visitWaterHeater() {
		System.out.println("뜨거운 물을 넣습니다.");
	}

	@Override
	public void visitMilkSteamer() {
		System.out.println("아메리카노에는 스팀밀크를 쓰지 않습니다.");
	}
}
