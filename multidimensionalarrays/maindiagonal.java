package multidimensionalarrays;

public class maindiagonal {
        public int solve(final int[][] A) {
            int n=A.length;
            int m=A[0].length;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==j){
                        sum+=A[i][j];
                    }
                }
            }

            return sum;
        }


}
