package day1;
import java.util.Scanner;

public class postass2day2 {
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

			System.out.println("enter the target:");

			int target=sc.nextInt();

			boolean match =false;

			

			for(int i=0;i<n;i++)

			{

				for(int j=i+1;j<n;j++)

				{

					if(a[i]+a[j]==target)

					{

						System.out.println("found match: "+a[i]+" + "+a[j]+" = "+target);

						match=true;

						break;

						

					}

					

			     }

				

	        }

			if (match==false)

			{

				System.out.println("no match found");

				

			}

			

	}

	}


