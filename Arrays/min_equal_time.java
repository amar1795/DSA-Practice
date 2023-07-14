package Arrays;

public class min_equal_time {
    public int solve(int[] A) {

        int n=A.length;
        int max=A[0];
        for(int i=1;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }

        int count=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=max-A[i];
            count=count+ans;;

        }
        return count;
    }
}
