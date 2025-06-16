package day1;
import java.util.Arrays;
import java.util.Scanner;
public class task1day9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {3, 5, 6, 2, 4, 9};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter the target value:");
        int target = s.nextInt();
        int lowerBoundIndex = findLowerBound(arr, target);
        if (lowerBoundIndex < arr.length) {
            System.out.println("Lower Bound of " + target + " is " + arr[lowerBoundIndex] + " at index " + lowerBoundIndex);
        } else {
            System.out.println("Lower Bound of " + target + " does not exist ");
        }
    }
    static int findLowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
   
} 




