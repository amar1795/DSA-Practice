package subarrays;

public class subarraysin2darray {

        public int[][] solve(int[] A) {

            int n=A.length;
            int [][]arr=new int [n*(n+1)/2][];
            int row=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    int size=j-i+1;

                    arr[row]=new int[size];

                    int col=0;
                    for(int l=i;l<=j;l++)
                    {
                        arr[row][col]=A[l];
                        col++;
                    }
                    row++;
                }
            }

            return arr;
        }


}
