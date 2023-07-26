package subarrays;

public class counting_subarrays {

        public int solve(int[] A, int B) {

            int count=0;
            int sum=0;
            int n=A.length;
            for(int i=0;i<n;i++)
            {
                sum=0;
                for(int j=i;j<n;j++)
                {
                    sum+=A[j];
                    if(sum<B)
                    {
                        count++;
                    }

                }

            }

            return count;
        }


}
