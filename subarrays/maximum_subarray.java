package subarrays;

public class maximum_subarray {


        public int maxSubarray(int A, int B, int[] C) {
            int n=C.length;
            int max=0;
            for(int i=0;i<n;i++)
            {
                int s=0;
                for(int j=i;j<n;j++)

                {
                    s+=C[j];
                    if(s>B)
                    {
                        break;
                    }
                    else
                    {
                        max=Math.max(max,s);
                    }
                }
            }

            return max;
        }


}
