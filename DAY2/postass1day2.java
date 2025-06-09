package day1;
import java.util.Scanner;

public class postass1day2 {
	public static void main (String[]args) {

			Scanner s=new Scanner(System.in);

			System.out.println("Enter the String:");

			String a=s.next();

			boolean ispali = true;

			 int start=0;

			 int end=a.length()-1;

			while(start<end)

			{

				if(a.charAt(start)!=a.charAt(end))

				{

					ispali = false;

					break;

				}

				start++;

				end--;

				

			}

			if(ispali==true)

			{

				System.out.println("It a is palindrome");

			}

			else

			{

				System.out.println("It is  not a palindrome");

				

			}

		}

	}








