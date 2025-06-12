package day1;

public class task1day6 {
		int num[]=new int[5];
		int top=-1;
		public void push(int n) {
			if(top==5){
				System.out.println("Stack Overflow");
			}
			else {
				num[++top]=n;
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
			for(int i=0;i<=top;i++) {
			System.out.println(num[i]);
		}}
		public static void main(String[] args) {
			task1day6 s=new task1day6();
			s.push(45);
			s.push(89);
			s.push(22);
			s.push(11);
			s.pop();
			s.display();

}}
