package subarrays;

public class odd_even_subararys {

        public int solve(int[] A, int B) {
            int n=A.length;
            int sum=0,cnt=0,ans=0;
            for(int i=0;i<n;i++)
            {
                sum=0;
                cnt=0;
                for(int j=i;j<n;j++)
                {
                    cnt++;
                    sum+=A[j];
                    if(cnt%2==0)//even length
                    {
                        if(sum<B)
                            ans++;
                    }
                    if(cnt%2==1)//odd
                    {
                        if(sum>B)
                            ans++;
                    }
                }
            }
            return ans;
        }


}
