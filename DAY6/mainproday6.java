package day1;

public class mainproday6 {
	    int[] queue = new int[5];
	    int front = 0;
	    int rear = 0;
	    public void enqueue(int data) {
	        if (rear == queue.length) {
	            System.out.println("Queue is full");
	        } else {
	            queue[rear] = data;
	            rear++;
	            System.out.println("Enqueued: " + data);
	        }
	    }
	    public void dequeue() {
	        if (front == rear) {
	            System.out.println("Queue is empty");
	        } else {
	            System.out.println("Dequeued: " + queue[front]);
	            front++;
	        }
	    }
	    public void display() {
	        if (front == rear) {
	            System.out.println("Queue is empty");
	        } else {
	            System.out.print("Queue: ");
	            for (int i = front; i < rear; i++) {
	                System.out.print(queue[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {

	    	mainproday6 q = new mainproday6();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.display();
	        q.dequeue();
	        q.display();
	    }
	}


