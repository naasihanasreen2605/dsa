package day1;
public class mainprogday7 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr); 
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


