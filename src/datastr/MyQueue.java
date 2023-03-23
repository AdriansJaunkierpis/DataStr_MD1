package datastr;

public class MyQueue<T> {
	private MyNodeQ frontNode;
	private MyNodeQ rearNode;
	private int length;
	
	public MyQueue() {
		frontNode = null;
		rearNode = null;
		length = 0;
	}
	
	public boolean isFull() {
		MyNodeQ temp = new MyNodeQ(0);
		return (temp == null); //TODO throw exception?
	}
	public boolean isEmpty() {
		return (length == 0);
	}
	public int size() {
		return length;
	}
	
	public void enqueue(T element) throws Exception {
		if (isFull()) {
			throw (new Exception("Queue is full"));
		}
		MyNodeQ newNode = new MyNodeQ<>(element);
		if (isEmpty()) {
			frontNode = newNode;
		} else {
			rearNode.setNext(newNode);
		}
		rearNode = newNode;
		length++;
	}
	public T dequeue() throws Exception {
		if (isEmpty()) {
			throw (new Exception("Queue is empty"));
		}
		MyNodeQ<T> oldFrontNode = frontNode;
		frontNode = frontNode.getNext();
		length--;
		if (isEmpty()) {
			rearNode = null;
		}
		return oldFrontNode.getElement();
	}
	public void print() {
		MyNodeQ tempNode = frontNode;
		for (int i = 0; i < length; i++) {
			System.out.print(tempNode.getElement() + " ");
			tempNode = tempNode.getNext();
		}
		System.out.println();
	}
	public void clear() {
		for (int i = 0; i < length; i++) {
			MyNodeQ tempNode = frontNode;
			frontNode = frontNode.getNext();
			tempNode.setNext(null);
		}
		length = 0;
	}
}
