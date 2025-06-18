package day1;
import java.util.Arrays;

public class mainproday9 {
		    public static void main(String[] args) {
		        int[] a = {20, 30, 40, 40, 60, 60, 70, 90};
		        Arrays.sort(a);
		        for (int i = 0; i < a.length / 2; i++) {
		            int temp = a[i];
		            a[i] = a[a.length - 1 - i];
		            a[a.length - 1 - i] = temp;
		        }
		        System.out.println("Descending array: " + Arrays.toString(a));
	int rank=1;
		        for (int i = 0; i < a.length;) {
		            int target = a[i];

		            int left = 0, right = a.length;
		            while (left < right) {
		                int mid = (left + right) / 2;
		                if (a[mid] > target) {
		                    left = mid + 1;
		                } else {
		                    right = mid;
		                }
		            }
		            int lowerBound = left;

		            left = 0;
		            right = a.length;
		            while (left < right) {
		                int mid = (left + right) / 2;
		                if (a[mid] >= target) {
		                    left = mid + 1;
		                } else {
		                    right = mid;
		                }
		            }
		            int upperBound = left;

		            int count = upperBound - lowerBound;
		            System.out.println("Count of " + target + " is " + count + " | Rank: " + rank);

		            rank=rank+count;

		            if (upperBound > i) {
		                i = upperBound;
		            } else {
		                i++;
		            }
		        }
		    }
		
	}

	