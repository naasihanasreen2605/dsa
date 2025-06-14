package day1;

public class postass1day6 {
		   static class Node {
		       int data;
		       Node next;
		       
		       Node(int value) {
		           data = value;
		           next = null;
		       }
		   }
		   static class Stack {
		       Node top = null;
		       public void push(int value) {
		           Node newNode = new Node(value);
		           newNode.next = top;
		           top = newNode;
		           System.out.println(value + " pushed to stack.");
		       }
		       public void pop() {
		           if (top == null) {
		               System.out.println("Stack is empty. Cannot pop.");
		               return;
		           }
		           System.out.println(top.data + " popped from stack.");
		           top = top.next;
		       }
		       public void display() {
		           if (top == null) {
		               System.out.println("Stack is empty.");
		               return;
		           }
		           System.out.print("Stack elements: ");
		           Node temp = top;
		           while (temp != null) {
		               System.out.print(temp.data + " ");
		               temp = temp.next;
		           }
		           System.out.println();
		       }
		   }
		   public static void main(String[] args) {
		       Stack s = new Stack();
		       s.push(10);
		       s.push(20);
		       s.push(30);
		       s.display();
		       s.pop();
		       s.display();
		   }
		}



