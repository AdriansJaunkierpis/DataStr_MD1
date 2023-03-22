package service;

import datastr.MyStack;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		MyStack numStack = new MyStack<>();
		System.out.println("Empty number stack tests: ");
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
		
		System.out.println("\nNumber stack tests: ");
		System.out.println("size(): " + numStack.size());
		System.out.print("print(): "); numStack.print();
		System.out.println("isFull(): " + numStack.isFull());
		System.out.println("isEmpty(): " + numStack.isEmpty());
		System.out.print("top(): "); try { System.out.println(numStack.top());} catch (Exception e) {System.out.println(e);}
		System.out.print("pop(): "); try { System.out.println(numStack.pop());} catch (Exception e) {System.out.println(e);}
		System.out.print("print(): "); numStack.print();
		
		int[] grades = {4, 6, 8};
		System.out.println("\nStudent stack tests: ");
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
		
		System.out.println("\n----------------------");
		System.out.println("Java koda sintakses parbaude");
		
	}
}
