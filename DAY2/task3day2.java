package day1;
import java.util.Arrays;
import java.util.Scanner;

public class task3day2 {
	public static void main (String [] args)

		{

			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the number of element for array:");

			int n=sc.nextInt();

			int []a=new int[n];

			System.out.println("enter the elements:");

			for(int i=0;i<n;i++)

			{

				a[i]=sc.nextInt();

			}

			Arrays.sort(a);

			System.out.print("Sorted array: ");

	        for (int i = 0; i < n; i++) {

	            System.out.print(a[i]);

	        }

	        

	        System.out.println();

			int start=0;

			

			for(int end=1;end<n;end++)

			{

				if(a[end]!=a[start])

				{

				start++;

				a[start]=a[end];

				}

			}

			System.out.println("removing duplicate elemnt");

		

			for(int i=0;i<=start;i++)

			{

				System.out.println(a[i]);

			

			}

			

		}	

		

		

	}


