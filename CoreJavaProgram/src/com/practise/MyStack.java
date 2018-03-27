package com.practise;

public class MyStack {

	private int maxSize;
	private int[] size ;
	private int top;
	
	MyStack(int i){
		maxSize =5;
		top=-1;
		size= new int[maxSize]; 
	}
	
	public void push(int j) {
		size[++top]=j;
	}
	public int pop() {
		return size[--top];
	}
	public int peek() {
		return size[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack(4);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		//myStack.push(60);
System.out.println("added all the list");
System.out.println("pop " + myStack.pop());
System.out.println("peek " + myStack.peek());
System.out.println("is Empty " + myStack.isEmpty());
System.out.println("is full " + myStack.isFull());
System.out.println("pop " + myStack.pop());
			
	}

}
