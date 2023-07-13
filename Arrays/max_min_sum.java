package Arrays;

import java.util.Scanner;

public class max_min_sum {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

        max_min_sum solution = new max_min_sum();
        int result = solution.solve(array);

        System.out.println("Sum is :"+result);






    }

    public int solve(int[] A) {

        int max=A[0];;
        int min=A[0];
        int n=A.length;
        for(int i=0;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }


            else if(A[i]<min)
            {
                min=A[i];
            }
        }

        int sum=max+min;
        return sum;






    }
}
