package day1;
import java.util.Scanner;
public class postass1day5 {
		Node last;
		class Node
		{
		 int data;
		 Node next;
		 Node(int val)
		 {
			 data=val;
		 }
		}
		public void  display() {
			Node temp = last.next; 
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != last.next);
	        System.out.println();
	    }
		public void insertAtBegin()
		{
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the value to insert:");
			 int val=sc.nextInt();
			Node newNode =new  Node(val);
			if(last==null)
			{
				last=newNode;
				last.next = last;
			}
			else
			{
		    	newNode.next=last.next;
				last.next=newNode;
				newNode =last;
			}
		}
		public void deleteAtAnyPos(){
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the position to delete:");
			 int pos=sc.nextInt();
			if(last==null)
			{
			    System.out.println("list is empty");
				return;
			}
			if(pos==0)
			{
				last=last.next;
				return;
			}
			Node temp=last;
			for(int i=0;i<(pos-1) && temp!=null;i++) 
			{
				temp=temp.next;
				if(temp==null||temp.next==null)
				{
					System.out.println("Invalid position");
				}	
			}
			temp.next=temp.next.next;	
		}
	public static void main(String[] args) {
		postass1day5 l=new postass1day5();
		Scanner s = new Scanner(System.in);
	    int choice;
	    do {
	        System.out.println("\n1. Insert");
	        System.out.println("2. Delete at position");
	        System.out.println("3. Display");
	        System.out.println("4. Exit");
	        System.out.print("Enter choice: ");
	        choice = s.nextInt();
	        switch (choice) {
	            case 1:
	                l.insertAtBegin();
	                break;
	            case 2:
	                l.deleteAtAnyPos();
	                break;
	            case 3:
	                l.display();
	                break;
	            case 4:
	                System.out.println("Exiting...");
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	    } while (choice != 4);

	}
}



