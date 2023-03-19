package datastr;

public class MyStack<T> {
	private MyNodeS topNode;
	private int length;
	
	public MyStack() {
		topNode = null;
		length = 0;
	}
	
	public boolean isFull() {
		MyNodeS temp = new MyNodeS(0);
		return (temp == null); //TODO throw exception?
	}
	public boolean isEmpty() {
		return (length == 0);
	}
	public int size() {
		return length;
	}
	
	public void push(T element) {
		if (isFull()) {
			//TODO fix push()
		}
		MyNodeS<T> oldTopNode = topNode;
		topNode = new MyNodeS<T>(element);
		topNode.setNext(oldTopNode);
		oldTopNode.setPrev(topNode);
		length++;
	}
	
	public void pop() {
		topNode = topNode.getNext();
		length--;
	}
	
	public T top() {
		return (T) topNode.getElement(); //TODO disaster?
	}
	
	public void print() {
		MyNodeS tempNode = topNode;
		for (int i = 0; i < length; i++) {
			System.out.println(tempNode.getElement() + " ");
			tempNode = tempNode.getNext();
		}
		System.out.println();
	}
	
	public void clear() {
		for (int i = 0; i < length; i++) {
			MyNodeS tempNode = topNode;
			topNode = topNode.getNext();
			tempNode.setNext(null);
		}
	}
}
