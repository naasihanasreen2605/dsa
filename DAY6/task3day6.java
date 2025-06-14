package day1;

public class task3day6 {
		int num[]=new int[5];
		int count=0;
		public void enqueue(int n) {
			if(count==num.length) {
				System.out.println("Queue is full");
				return;
			}
			else{
				num[count]=n;
				count++;
				
			}}
			public void dequeue() {
				if(count==0) {
					System.out.println("Queue is empty");
					return;
					
				}
				else{
					for(int i=1;i<count;i++) {
						num[i-1]=num[i];
						
					}
					count--;
					
				}
			}
			public void display() {
				for(int i=0;i<count;i++) {
				System.out.println(num[i]);
			}
			}
			public static void main(String args[]) {
				task3day6 t=new task3day6();
				t.enqueue(22);
				t.enqueue(44);
				t.display();
				t.dequeue();
				t.display();
				
			}
		}


