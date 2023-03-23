package datastr;

public class MyNodeQ<T> {
	
	private T element;
	private MyNodeQ next = null;
	
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
	
	public MyNodeQ getNext() {
		return next;
	}
	public void setNext(MyNodeQ next) {
		this.next = next;
	}

	
	public MyNodeQ (T element) {
		setElement(element);
	}
}
