package datastr;

public class MyNodeD<T> {
	
	private T element;
	private MyNodeD next = null;
	private MyNodeD prev = null;
	
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		if (element != null) {
			this.element = element;
		} else {
			this.element = (T) new Object();
		}
	}
	
	public MyNodeD getNext() {
		return next;
	}
	public void setNext(MyNodeD next) {
		this.next = next;
	}
	
	public MyNodeD getPrev() {
		return prev;
	}
	public void setPrev(MyNodeD prev) {
		this.prev = prev;
	}
	
	
	public MyNodeD (T element) {
		setElement(element);
	}
}
