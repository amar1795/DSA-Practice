package prefixsum;

public class evensumrange {
    public int[] solve(int[] A, int[][] B) {

        int n=A.length;
        int m=B.length;
        int ans[]=new int[m];
        int pf[]=new int[n];

        if(A[0]%2==0)
        {
            pf[0]=1;
        }
        else
        {
            pf[0]=0;
        }

        //prefix sum created
        for(int i=1;i<n;i++)
        {
            if(A[i]%2==0)
            {
                pf[i]=pf[i-1]+1;
            }
            else {
                pf[i] = pf[i - 1];
            }
        }

        for(int i=0;i<m;i++)
        {

            // int left = B[i][0];
            // int right = B[i][1];


            if(B[i][0]==0)
            {
                ans[i] = pf[B[i][1]];
            }
            else
            {
                ans[i] = pf[B[i][1]]-pf[B[i][0]-1];
            }


        }

        return ans;

    }
}
