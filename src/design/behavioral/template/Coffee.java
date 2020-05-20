package design.behavioral.template;

public abstract class Coffee {
	
	public void make() {
		System.out.println(getClass().getSimpleName() + "을 만들기 시작합니다.");
		makeByTemplate();
		System.out.println(getClass().getSimpleName() + "가 완성되었습니다.");
		System.out.println();
	}
	
	private void makeByTemplate() {
		extractEspresso();
		addHotWater();
		addSteamMilk();
	}
	
	private void extractEspresso() {
		System.out.println("에스프레소를 추출합니다.");
	}
	
	protected abstract void addHotWater();
	protected abstract void addSteamMilk();
}
