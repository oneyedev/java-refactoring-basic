package design.behavioral.iterator;

public class MyArrayList<T> implements MyIteratable<T> {

	private T[] elements;
	
	public MyArrayList(T[] elements) {
		this.elements = elements;
	}

	@Override
	public MyIterator<T> createIterator() {
		return new MyArrayListIterator();
	}
	
	public class MyArrayListIterator implements MyIterator<T>{

		private int index;
		
		@Override
		public boolean hasNext() {
			return index < elements.length;
		}

		@Override
		public T next() {
			return elements[index++];
		}
	}
}
