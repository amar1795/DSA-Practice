public class Solution {
    public int[] solve(int[] A, int B) {

        int e=A.length;
        B = B % e;
        reverse_array(A,0,e-1);
        reverse_array(A,0,B-1);
        reverse_array(A,B,e-1);

        return A;

    }

    public int [] reverse_array(int [] A,int s,int e)
    {

        while(s<e)
        {
            int temp=A[e];
            A[e]=A[s];
            A[s]=temp;

            s++;
            e--;
        }

        return A;


    }



}
