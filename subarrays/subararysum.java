package subarrays;


import java.util.Scanner;



public class subararysum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        printSubarraySum(arr);

        scanner.close();
    }

    public static void printSubarraySum(int[] arr) {
        int[] prefixSums = new int[arr.length + 1];
        int totalSum = 0;

        prefixSums[0] = 0;  // Initialize the first element with 0

        for (int i = 1; i <= arr.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                totalSum += prefixSums[j] - prefixSums[i];
            }
        }

        System.out.println("Sum of every subarray: " + totalSum);
    }
}

//subararysum using prefixsum


