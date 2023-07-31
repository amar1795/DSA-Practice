package Arrays;

public class increasing_triplets {

        public int solve(int[] A) {
            int n=A.length;

            int totalans=0;
            for(int i=1;i<n;i++)
            {
                int ans=0;
                int left=i-1;int leftcount=0;
                while(left>=0)
                {
                    if(A[left]<A[i])
                    {
                        leftcount++;
                    }
                    left--;

                }
                int right=i+1;int rightcount=0;
                while(right<n)
                {
                    if(A[right]>A[i])
                    {
                        rightcount++;
                    }
                    right++;

                }

                ans=leftcount*rightcount;

                totalans+=ans;

            }

            return totalans;
        }


}
