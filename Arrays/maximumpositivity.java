package Arrays;

public class maximumpositivity {

        public int[] solve(int[] A) {
            int n=A.length;
            int ans=0;
            for(int i=0;i<n;i++)
            {

                if(A[i]<0)
                {

                    int L=A[i-1];
                    int R=A[i+1];
                    int lcount=0;
                    int rcount=0;
                    while(L>=0  )
                    {
                        lcount++;
                        L--;
                    }
                    while(R>=0 )
                    {
                        rcount++;
                        R++;
                    }

                    if(lcount==rcount)
                    {
                        ans=Math.min(L,R);
                    }

                    else
                    {
                        ans=Math.max(lcount,rcount);
                    }


                }
            }

            return ans;
        }


}
