package prefixsum;

public class equilibriumsum {
    public int solve(int[] A) {
        int n=A.length;
        int []pf=new int[n];

        pf[0]=A[0];
        //prefix sum created
        for(int i=1;i<n;i++)
        {
            pf[i]=pf[i-1]+A[i];
        }

        int sl=0;
        for(int i=0;i<n;i++)
        {


            if( i==0)
            {
                sl=0;
            }
            else
            {
                sl=pf[i-1];
            }

            int sr=pf[n-1]-pf[i];


            if(sl==sr)
            {
                return i;
            }
        }

        return -1;

    }
}
