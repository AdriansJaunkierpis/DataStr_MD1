package datastr;

public class MyDeque<T> {
	private MyNodeD frontNode;
	private MyNodeD rearNode;
	private int length;
	
	public MyDeque() {
		frontNode = null;
		rearNode = null;
		length = 0;
	}
	
	public boolean isFull() {
		MyNodeD temp = new MyNodeD(0);
		return (temp == null); //TODO throw exception?
	}
	public boolean isEmpty() {
		return (length == 0);
	}
	public int size() {
		return length;
	}
	
	public void enqueueAtFront(T element) throws Exception {
		if (isFull()) {
			throw (new Exception("Deque is full"));
		}
		MyNodeD newNode = new MyNodeD<>(element);
		if (isEmpty()) {
			rearNode = newNode;
		} else {
			frontNode.setPrev(newNode);
			newNode.setNext(frontNode);
		}
		frontNode = newNode;
		length++;
	}
	public void enqueueAtEnd(T element) throws Exception {
		if (isFull()) {
			throw (new Exception("Deque is full"));
		}
		MyNodeD newNode = new MyNodeD<>(element);
		if (isEmpty()) {
			frontNode = newNode;
		} else {
			rearNode.setNext(newNode);
			newNode.setPrev(rearNode);
		}
		rearNode = newNode;
		length++;
	}
	
	public T dequeueFromFront() throws Exception {
		if (isEmpty()) {
			throw (new Exception("Deque is empty"));
		}
		MyNodeD<T> oldFrontNode = frontNode;
		frontNode = frontNode.getNext();
		length--;
		if (isEmpty()) {
			rearNode = null;
		} else {
			frontNode.setPrev(null);
		}
		return oldFrontNode.getElement();
	}
	public T dequeueFromEnd() throws Exception {
		if (isEmpty()) {
			throw (new Exception("Deque is empty"));
		}
		MyNodeD<T> oldRearNode = rearNode;
		rearNode = rearNode.getPrev();
		length--;
		if (isEmpty()) {
			frontNode = null;
		} else {
			rearNode.setNext(null);
		}
		return oldRearNode.getElement();
	}
	public void print() {
		MyNodeD tempNode = frontNode;
		for (int i = 0; i < length; i++) {
			System.out.print(tempNode.getElement() + " ");
			tempNode = tempNode.getNext();
		}
		System.out.println();
	}
	public void clear() {
		for (int i = 0; i < length; i++) {
			MyNodeD tempNode = frontNode;
			frontNode = frontNode.getNext();
			//frontNode.setPrev(null);
			tempNode.setNext(null);
		}
		length = 0;
	}
}
