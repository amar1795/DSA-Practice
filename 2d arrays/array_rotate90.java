public class Solution {
    public void solve(int[][] A) {
        int n=A.length;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                // transposing the matrix
                temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;

            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                // swapping the matrix
                temp=A[i][j];
                A[i][j]=A[i][n-j-1];
                A[i][n-j-1]=temp;

            }

        }
    }
}
