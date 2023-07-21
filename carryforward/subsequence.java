package carryforward;

public class subsequence {
    public int solve(String A) {
        int sum=0;
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='A')
            {
                sum++;
            }

            if(A.charAt(i)=='G')
            {
                count+=sum;
            }

            count=count%1000000007;

        }

        return count%1000000007;
    }
}
