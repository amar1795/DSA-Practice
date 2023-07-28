package multidimensionalarrays;

public class transpose {

        public int[][] solve(int[][] A) {
            int n=A.length;
            int m=A[0].length;
            int arr[][]=new int[m][n];
            for(int i=0;i<n;i++)
            {

                for(int j=0;j<m;j++)
                {
                    arr[j][i]=A[i][j];
                }

            }
            return arr;
        }


}
