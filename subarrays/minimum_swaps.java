package subarrays;

public class minimum_swaps {


        public int solve(int[] A, int B) {
            int n=A.length;
            int window_length=0;
            for(int i=0;i<n;i++)
            {
                if(A[i]<=B)
                {
                    window_length++;
                }

            }

            int count=0;
            int j=0;int k=window_length;
            while(j<k)
            {
                if(A[j]<=B)
                {
                    count++;
                }
                j++;
            }
            int maxsubarray=count;

            j=1;k=window_length;
            while(k<n)
            {
                if(A[j-1]<=B)
                {
                    count--;
                }

                if(A[k]<=B)
                {
                    count++;
                }

                if(maxsubarray<count)
                {
                    maxsubarray=count;
                }
                j++;
                k++;

            }

            int ans=window_length-maxsubarray;
            return ans;


        }


}
