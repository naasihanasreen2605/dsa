package day1;
import java.util.Scanner;

public class task2day6 {
	int num[]=new int[5];
	int top=-1;
	public void push() {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the element:");
		int s=n.nextInt();
		if(top==5) {
			System.out.println("Stack Overflow");
		}
		else {
			num[++top]=s;
			display();
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else {
			top--;
		}
	}
	public void display() {
		for(int i=0;i<=num[i];i++) {
			System.out.println(num[i]);
		}
	}
	public static void main(String args[]) {
		task2day6 t=new task2day6();
		int choice;
		do {
		System.out.println("Enter your choice:");
		System.out.println("1.PUSH");
		System.out.println("2.POP");
		System.out.println("3.DISPLAY");
		System.out.println("4.EXIT");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			t.push();
			break;
		case 2:
			t.pop();
			break;
		case 3:
			t.display();
			break;
		case 4:
			System.out.println("Exiting");
		}

		
		
	}while(choice!=4);
    
}}
