package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import datastr.MyDeque;
import datastr.MyQueue;
import datastr.MyStack;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		int[] grades = {4, 6, 8}; //for Student() objects
		MyStack numStack = new MyStack<>();
		System.out.println("Empty number Stack tests: ");
		System.out.println("size(): " + numStack.size());
		System.out.print("print(): "); numStack.print();
		System.out.println("isFull(): " + numStack.isFull());
		System.out.println("isEmpty(): " + numStack.isEmpty());
		System.out.print("top(): "); try { System.out.print(numStack.top());} catch (Exception e) {System.out.println(e);}
		System.out.print("pop(): "); try { System.out.println(numStack.pop());} catch (Exception e) {System.out.println(e);}
		try {
			numStack.push(3);
			numStack.push(6);
			numStack.push(3);
			numStack.push(7);
		} catch (Exception e) { System.out.println(e); }
		
		System.out.println("\nNumber Stack tests: ");
		System.out.println("size(): " + numStack.size());
		System.out.print("print(): "); numStack.print();
		System.out.println("isFull(): " + numStack.isFull());
		System.out.println("isEmpty(): " + numStack.isEmpty());
		System.out.print("top(): "); try { System.out.println(numStack.top());} catch (Exception e) {System.out.println(e);}
		System.out.print("pop(): "); try { System.out.println(numStack.pop());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); numStack.print();
		System.out.print("clear(), print(): "); numStack.clear(); numStack.print();
		
		System.out.println("\nStudent Stack tests: ");
		MyStack studentStack = new MyStack<>();
		try {
			studentStack.push(new Student("Janis", "Jaunberzs", grades));
			studentStack.push(new Student("Karlis", "Karklins", grades));
			studentStack.push(new Student("Oskars", "Osis", grades));
			studentStack.push(new Student("Andris", "Alksnis", grades));
		} catch (Exception e) { System.out.println(e); }
		System.out.println("size(): " + studentStack.size());
		System.out.print("print(): "); studentStack.print();
		System.out.println("isFull(): " + studentStack.isFull());
		System.out.println("isEmpty(): " + studentStack.isEmpty());
		System.out.print("top(): "); try { System.out.println(studentStack.top());} catch (Exception e) {System.out.println(e);}
		System.out.print("pop(): "); try { System.out.println(studentStack.pop());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); studentStack.print();
		System.out.print("clear(), print(): "); studentStack.clear(); studentStack.print();
		
		
		System.out.println("\n----------------------");
		System.out.println("Empty number Queue tests:");
		MyQueue numQueue = new MyQueue<>();
		System.out.println("size(): " + numQueue.size());
		System.out.print("print(): "); numQueue.print();
		System.out.println("isFull(): " + numQueue.isFull());
		System.out.println("isEmpty(): " + numQueue.isEmpty());
		System.out.print("dequeue(): "); try { System.out.println(numQueue.dequeue());} catch (Exception e) {System.out.println(e);}
		try {
			numQueue.enqueue(3);
			numQueue.enqueue(6);
			numQueue.enqueue(3);
			numQueue.enqueue(7);
		} catch (Exception e) { System.out.println(e); }
		
		System.out.println("\nNumber Queue tests: ");
		System.out.println("size(): " + numQueue.size());
		System.out.print("print(): "); numQueue.print();
		System.out.println("isFull(): " + numQueue.isFull());
		System.out.println("isEmpty(): " + numQueue.isEmpty());
		System.out.print("dequeue(): "); try { System.out.println(numQueue.dequeue());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); numQueue.print();
		System.out.print("clear(), print(): "); numQueue.clear(); numQueue.print();
	
		System.out.println("\nStudent Queue tests: ");
		MyQueue studentQueue = new MyQueue<>();
		try {
			studentQueue.enqueue(new Student("Janis", "Jaunberzs", grades));
			studentQueue.enqueue(new Student("Karlis", "Karklins", grades));
			studentQueue.enqueue(new Student("Oskars", "Osis", grades));
			studentQueue.enqueue(new Student("Andris", "Alksnis", grades));
		} catch (Exception e) { System.out.println(e); }
		System.out.println("size(): " + studentQueue.size());
		System.out.print("print(): "); studentQueue.print();
		System.out.println("isFull(): " + studentQueue.isFull());
		System.out.println("isEmpty(): " + studentQueue.isEmpty());
		System.out.print("dequeue(): "); try { System.out.println(studentQueue.dequeue());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); studentQueue.print();
		System.out.print("clear(), print(): "); studentQueue.clear(); studentQueue.print();
		
		
		System.out.println("\n----------------------");
		System.out.println("Empty number Deque tests:");
		MyDeque numDeque = new MyDeque<>();
		System.out.println("size(): " + numDeque.size());
		System.out.print("print(): "); numDeque.print();
		System.out.println("isFull(): " + numDeque.isFull());
		System.out.println("isEmpty(): " + numDeque.isEmpty());
		System.out.print("dequeueFromFront(): "); try { System.out.println(numDeque.dequeueFromFront());} catch (Exception e) {System.out.println(e);}
		System.out.print("dequeueFromEnd(): "); try { System.out.println(numDeque.dequeueFromEnd());} catch (Exception e) {System.out.println(e);}
		try {
			numDeque.enqueueAtFront(3);
			numDeque.enqueueAtFront(6);
			numDeque.enqueueAtFront(3);
			numDeque.enqueueAtFront(7);
		} catch (Exception e) { System.out.println(e); }
		System.out.println("\nNumber Deque tests:");
		System.out.println("size(): " + numDeque.size());
		System.out.print("print(): "); numDeque.print();
		System.out.println("isFull(): " + numDeque.isFull());
		System.out.println("isEmpty(): " + numDeque.isEmpty());
		System.out.print("enqueueAtFront(5): "); try { numDeque.enqueueAtFront(5);} catch (Exception e) {System.out.println(e);} numDeque.print();
		System.out.print("enqueueAtEnd(8): "); try { numDeque.enqueueAtEnd(8);} catch (Exception e) {System.out.println(e);} numDeque.print();
		System.out.print("dequeueFromFront(): "); try { System.out.println(numDeque.dequeueFromFront());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); numDeque.print();
		System.out.print("dequeueFromEnd(): "); try { System.out.println(numDeque.dequeueFromEnd());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); numDeque.print();
		System.out.print("clear(), print(): "); numDeque.clear(); numDeque.print();
		
		System.out.println("\nStudent Deque tests: ");
		MyDeque studentDeque = new MyDeque<>();
		try {
			studentDeque.enqueueAtFront(new Student("Janis", "Jaunberzs", grades));
			studentDeque.enqueueAtEnd(new Student("Karlis", "Karklins", grades));
		} catch (Exception e) { System.out.println(e); }
		System.out.println("size(): " + studentDeque.size());
		System.out.print("print(): "); studentDeque.print();
		System.out.println("isFull(): " + studentDeque.isFull());
		System.out.println("isEmpty(): " + studentDeque.isEmpty());
		System.out.print("enqueueAtFront(): "); try { studentDeque.enqueueAtFront(new Student("Oskars", "Osis", grades));} catch (Exception e) {System.out.println(e);} studentDeque.print();
		System.out.print("enqueueAtEnd(): "); try { studentDeque.enqueueAtEnd(new Student("Andris", "Alksnis", grades));} catch (Exception e) {System.out.println(e);} studentDeque.print();
		System.out.print("dequeueFromFront(): "); try { System.out.println(studentDeque.dequeueFromFront());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); studentDeque.print();
		System.out.print("dequeueFromEnd(): "); try { System.out.println(studentDeque.dequeueFromEnd());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); studentDeque.print();
		System.out.print("clear(), print(): "); studentDeque.clear(); studentDeque.print();
		
		
		System.out.println("\n----------------------");
		System.out.println("Java koda sintakses parbaude:");
		try {
			System.out.print("Student.java: ");
			syntaxTest("resources/Student.java");
			System.out.print("UserController.java: ");
			syntaxTest("resources/UserController.java");
			System.out.print("UserServiceImplTest.java: ");
			syntaxTest("resources/UserServiceImplTest.java");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
		System.out.println("\n----------------------");
		System.out.println("Telefona numuri un zvanisanas simulacija (Press 0):");
		System.out.println("Web history (Press 1):");
		System.out.print("Choose which function to start: ");
		Scanner myScanner = new Scanner(System.in);
	    String userInput = myScanner.nextLine();
	    if (userInput.charAt(0) == '0') {
	    	callSimulator();
	    }
	    if (userInput.charAt(0) == '1') {
	    	webHistory();
	    }
	}
	
	public static void syntaxTest(String path) throws FileNotFoundException {
		File myFile = new File(path);
		FileInputStream myInputStream = new FileInputStream(myFile);
		Scanner myScanner = new Scanner(myInputStream);
		
		MyStack iekavuStack = new MyStack<>();
		int row = 1;
		while(myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '{' || line.charAt(i) == '('/* || line.charAt(i) == '['*/) {
					try {
						iekavuStack.push(line.charAt(i));
					} catch (Exception e) { System.out.println(e);}
				}
				try {
					if (line.charAt(i) == '}' || line.charAt(i) == ')' /*|| line.charAt(i) == ']'*/) {
						if (line.charAt(i) == '}' && (char) iekavuStack.top() == '{') {
							iekavuStack.pop();
						}
						else if (line.charAt(i) == ')' && (char) iekavuStack.top() == '(') {
							iekavuStack.pop();
						}
						/*else if (line.charAt(i) == ']' && (char) iekavuStack.top() == '[') {
							iekavuStack.pop();
						}*/ else {
							System.out.println("Error on line: " + row);
							return;
						}
					}
				} catch (Exception e) { System.out.println(e);}
			}
			row++;
		}
		iekavuStack.print();
		System.out.println("File has no errors");
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	public static void callSimulator() { //es ceru ka infinite loop ir ok
		MyQueue callerQueue = new MyQueue<>();
		
		Thread thread1 = new Thread () {
			  public void run () {
				  while (true) {
					  try {
							callerQueue.enqueue(getRandomNumber(10000000, 99999999));
							System.out.print("\nCall added: ");
							callerQueue.print();
							Thread.sleep(1000);
					  } catch (Exception e) { System.out.println(e);}
				  } 
			  }
			};
		Thread thread2 = new Thread () {
			public void run () {
				while (true) {
					try {
						callerQueue.dequeue();
						System.out.print("Call finished, remaining: ");
						callerQueue.print();
						Thread.sleep(1700);
				  } catch (Exception e) { System.out.println(e);}
				}
		  }
		};
		thread1.start();
		thread2.start();
	}
	
	public static void webHistory() {
		MyDeque webDeque = new MyDeque<>();
		Scanner myScanner = new Scanner(System.in);
		String userInput = "temp";
		System.out.println("\nEnter '0' to quit");
		while (userInput.charAt(0) != '0' || userInput.length() > 1) {
			System.out.println("Enter the website URL: ");
			userInput = myScanner.nextLine();
			if (userInput.charAt(0) == '1' && userInput.length() == 1) {
				try {
					System.out.println(webDeque.dequeueFromFront());
				} catch (Exception e) { System.out.println(e);}
			} else {
				try {
					webDeque.enqueueAtFront(userInput);
				} catch (Exception e) { System.out.println(e);}
				if (webDeque.size() >= 11) {
					try {
						webDeque.dequeueFromEnd();
					} catch (Exception e) { System.out.println(e);}
				}
			}
			//webDeque.print();
		}
	}
}
