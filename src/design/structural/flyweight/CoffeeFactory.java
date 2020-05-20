package design.structural.flyweight;

import java.util.Map;
import java.util.WeakHashMap;

public class CoffeeFactory {
	
	private static final Map<String, Coffee> CACHE = new WeakHashMap<>();
	
	public static Coffee intern(String name) {
		synchronized (CACHE) {
			return CACHE.computeIfAbsent(new String(name), Coffee::new);
		}
	}
	
	public static String cacheInfo() {
		synchronized (CACHE) {
			return CACHE.entrySet().toString();
		}
	}
}
