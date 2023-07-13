package Arrays;

public class second_largest {

    public int solve(int[] A) {
        int n=A.length;
        int max=0;

        for(int i=1;i<n;i++)
        {
            if(A[i]>A[max])
            {
                max=i;
            }

        }

        int min_value=-1;

        for(int i=0;i<n;i++)
        {
            if(A[i]!=A[max])
            {
                min_value=Math.max(min_value,A[i]);
            }

        }

        return min_value;




    }
}
