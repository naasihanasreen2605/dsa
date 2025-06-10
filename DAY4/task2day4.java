package day1;

import day1.task1day4.Node;

public class task2day4 {
	Node head;
	class Node
	{
	 int data;
	 Node next;
	 Node prev;
	 Node(int val)
	 {
		 data=val;
		 next=null;
		 prev=null;
	 }
	}
	 public  task2day4() {
		head =null;
   }
	public void insertAtBegin(int val)
	{
		Node newNode =new  Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	public void insertInMiddle(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prevNode = slow.prev;
        newNode.next = slow;
        newNode.prev = prevNode;
        slow.prev = newNode;
        if (prevNode != null) {
            prevNode.next = newNode;
        } else {
            head = newNode;
        }
    }
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
	}
	 public static void main(String args[]) {
		 task2day4 l=new  task2day4();
		 l.insertAtBegin(60);
		 l.insertAtBegin(50);
		 l.insertAtBegin(40);
		 l.insertAtBegin(30);
		 l.insertAtBegin(20);
		 l.insertAtBegin(10);
		 l.insertAtBegin(777);
		 l.display();
		 System.out.println();
		 System.out.println("After inserting 555 in the middle:");
		 l.insertInMiddle(555);
		 l.display();
	 }
	}



