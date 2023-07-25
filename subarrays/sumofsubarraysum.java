package subarrays;

public class sumofsubarraysum {
    public long subarraySum(int[] A) {

        long sum=0;
        int n=A.length;

        for(int i=0;i<n;i++)
        {
            sum+=((long)A[i]*(i+1)*(n-i));

        }
        return sum;
    }
}
