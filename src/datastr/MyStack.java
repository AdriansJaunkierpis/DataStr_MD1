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
	
	public void push(T element) throws Exception {
		if (isFull()) {
			throw (new Exception("Stack is full"));
		}
		MyNodeS<T> oldTopNode = topNode;
		topNode = new MyNodeS<T>(element);
		topNode.setNext(oldTopNode);
		length++;
		if (isEmpty()) {
			oldTopNode.setPrev(topNode);
		}
	}
	
	public T pop() throws Exception {
		if (isEmpty()) {
			throw (new Exception("Stack is empty"));
		}
		MyNodeS<T> oldTopNode = topNode;
		topNode = topNode.getNext();
		length--;
		return oldTopNode.getElement();
	}
	
	public T top() throws Exception {
		if (isEmpty()) {
			throw (new Exception("Stack is empty"));
		}
		return (T) topNode.getElement();
	}
	
	public void print() { //TODO warn if empty
		MyNodeS tempNode = topNode;
		for (int i = 0; i < length; i++) {
			System.out.print(tempNode.getElement() + " ");
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
