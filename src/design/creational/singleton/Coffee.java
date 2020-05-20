package design.creational.singleton;

public final class Coffee {
	
	private static final Coffee INSTANCE = new Coffee();
	
	private Coffee() {
		
	}
	
	public static Coffee getInstance() {
		return INSTANCE;
	}

	public void drink() {
		System.out.println(getClass().getSimpleName() + " 을 마십니다.");
	}
}
