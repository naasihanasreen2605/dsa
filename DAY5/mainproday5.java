package day1;
import java.util.Scanner;
public class mainproday5 {
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
			public void insertAtBegin(int val)
			{
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
			public static void main(String args[]) {
				mainproday5 l=new  mainproday5();
				 l.insertAtBegin(60);
				 l.insertAtBegin(50);
				 l.insertAtBegin(40);
				 l.display();
				 l.deleteAtAnyPos();
				 l.display();
		}
		}




