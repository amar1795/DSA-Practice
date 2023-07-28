package multidimensionalarrays;

public class minordiagonals {

        public int solve(final int[][] A) {

            int n=A.length;
            int m=A[0].length;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {

                    if( (i+1) + (j+1) == m + 1)
                    {
                        sum+=A[i][j];
                    }

                }
            }

            return sum;
        }


}
