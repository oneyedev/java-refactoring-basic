package design.behavioral.iterator;

public interface MyIteratable<T> {
	MyIterator<T> createIterator();
}
