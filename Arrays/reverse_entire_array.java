package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class reverse_entire_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = sc.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));

        reverseArray(array);
//        reversing an array

        System.out.println("Reversed array: " + Arrays.toString(array));
        sc.close();

    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}
