package prefixsum;

public class productsum {
    public int[] solve(int[] A) {
        int n=A.length;
        int pro_arr[]=new int[n];
        int mul=1;
        for(int i=0;i<n;i++)
        {
            mul=mul*A[i];
        }

        for(int i=0;i<n;i++)
        {
            pro_arr[i]=Math.floorDiv(mul, A[i]);
        }

        return pro_arr;



    }
}
