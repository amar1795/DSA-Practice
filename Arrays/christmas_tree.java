package Arrays;

public class christmas_tree {

        public int solve(int[] A, int[] B) {

            final int inf = (int)(1e9 + 10);
            // int inf=Integer.MAX_VALUE;
            int ans=inf;
            int totalans=inf;
            int n=A.length;
            for(int i=1;i<n-1;i++)
            {
                int left_min=inf;int right_min=inf;
                for(int j=i-1;j>=0;j--)
                {
                    if(A[j]<A[i])
                    {
                        left_min=Math.min(left_min,B[j]);
                    }
                }

                for(int j=i+1;j<n;j++)
                {
                    if(A[j]>A[i])
                    {
                        right_min=Math.min(right_min,B[j]);
                    }
                }

                totalans=left_min+right_min+B[i];
                ans=Math.min(ans,totalans);

            }

            if(ans==inf)
            {
                ans=-1;
            }
            return ans;
        }




}
