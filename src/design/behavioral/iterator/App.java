package design.behavioral.iterator;

public class App {
	public static void main(String[] args) {
		Integer[] arr = new Integer[]{1,2,3,4,5};
		MyIteratable<Integer> list = new MyArrayList<>(arr);
		MyIterator<Integer> iterator = list.createIterator();
		while(iterator.hasNext()) {
			Integer current = iterator.next();
			System.out.println(current);
		}
	}
}
