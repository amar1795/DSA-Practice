package subarrays;

public class subarraysum {

        public int solve(int[] A, int B, int C) {

            int n=A.length;
            int s=0;int k=B-1;
            int sum=0;
            while(s<=k)
            {
                sum+=A[s];
                s++;
            }

            if(sum==C)
            {
                return 1;
            }
            s=1; k=B;

            while(k<n)
            {
                sum=sum-A[s-1];
                sum=sum+A[k];
                s++;
                k++;


                if(sum==C)
                {
                    return 1;
                }
            }

            return 0;
        }


}





























