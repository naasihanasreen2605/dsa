package day1;
import java.util.Arrays;
import java.util.Scanner;
public class task2day9 {
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int arr[] = {3, 5, 6, 2, 4, 9};
	        Arrays.sort(arr);
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	        System.out.println("Enter the target value:");
	        int target = s.nextInt();
	        int upperBoundIndex = findupperBound(arr, target);
	        if (upperBoundIndex < arr.length) {
	            System.out.println("Upper Bound of " + target + " is " + arr[upperBoundIndex] + " at index " + upperBoundIndex);
	        } else {
	            System.out.println("Upper Bound of " + target + " does not exist ");
	        }
	    }
	    static int findupperBound(int[] arr, int target) {
	        int left = 0, right = arr.length;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }
	}
	


