package Arrays;
import java.util.Scanner;
import java.util.*;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }



        System.out.print("Enter the value of B: ");
        int B = scanner.nextInt();


        //object created since calling the solve function which is non static from a static class
        Array_Rotation solution = new Array_Rotation();
        int[] result = solution.solve(array, B);

        System.out.println("Modified Array:");
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
        for (int j=0;j<result.length;j++) {
            System.out.print(result[j] + " ");
        }
    }

    public int[] solve(int[] A, int B) {
        int e = A.length;
        B = B % e;
        reverseArray(A, 0, e - 1);
        reverseArray(A, 0, B - 1);
        reverseArray(A, B, e - 1);
        return A;
    }

    public int[] reverseArray(int[] A, int s, int e) {
        while (s < e) {
            int temp = A[e];
            A[e] = A[s];
            A[s] = temp;
            s++;
            e--;
        }
        return A;
    }
}
