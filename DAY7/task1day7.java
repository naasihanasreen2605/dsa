package day1;
import java.util.Arrays;
import java.util.Scanner;

public class task1day7 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int arrsize=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[arrsize];
		for(int i=0;i<arrsize;i++) {
			arr[i]=sc.nextInt();		
		}
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
				
			}
			System.out.println(Arrays.toString(arr));
			
		}
		
				
	
	}
}
