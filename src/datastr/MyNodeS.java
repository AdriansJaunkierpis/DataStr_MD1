package datastr;

public class MyNodeS<T> {
	
	private T element;
	private MyNodeS next = null;
	
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
	
	public MyNodeS getNext() {
		return next;
	}
	public void setNext(MyNodeS next) {
		this.next = next;
	}
	
	
	public MyNodeS (T element) {
		setElement(element);
	}
}
