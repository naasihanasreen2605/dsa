package day1;
import java.util.Scanner;
import java.util.Arrays;

public class task2day8 {
	public int BinSea(int arr[],int find,int start,int end)
	{
		if(start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]==find) {
			return mid;
		}
		else if(find>arr[mid]) {
			return BinSea(arr,find,mid+1,end);
		}
		else {
			return BinSea(arr,find,mid-1,start);
		}
	}
	public void BinarySearch(){
		int arr[]= {2,4,5,6,7,8};
		Scanner s=new Scanner(System.in);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Enter the element to find: ");
		int find=s.nextInt();
		
		int result= BinSea(arr,find,0,arr.length-1);
			if(result!=-1) {
				
				System.out.println("Value found "+ result);
			}
			else {
				System.out.println("Value not found");
			}
		}
		
	public static void main(String []args) {
	 task2day8 t=new task2day8();
	 t.BinarySearch();

}
}



		