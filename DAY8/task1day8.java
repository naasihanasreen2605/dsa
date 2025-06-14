package day1;
import java.util.Arrays;
import java.util.Scanner;

public class task1day8 {
	public static void main(String args[]) {
		int arr[]= {22,5,7,8,9};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to find:");
		int find=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				System.out.println("Value found:"+ arr[i]+ " index:"+ i);
				flag=true;
				break;
				
			}

		}
		if(!flag) {
		System.out.println("Value not found");
		
		}
		
		
	
		}
}
