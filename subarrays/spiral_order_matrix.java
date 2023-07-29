package subarrays;

public class spiral_order_matrix {

        public int[][] generateMatrix(int A) {


            int [][] arr=new int[A][A];

            int n=arr.length;
            int num=1;
            int i=0;int j=0;

            if(n==1)
            {
                arr[i][j]=A;
            }
            while(n>0)
            {
                for(int x=1;x<n;x++)
                {
                    arr[i][j]=num;
                    j++;
                    num++;
                }
                for(int x=1;x<n;x++)
                {
                    arr[i][j]=num;
                    i++;
                    num++;
                }
                for(int x=1;x<n;x++)
                {
                    arr[i][j]=num;
                    j--;
                    num++;
                }
                for(int x=1;x<n;x++)
                {
                    arr[i][j]=num;
                    i--;
                    num++;
                }

                i++;j++;
                n=n-2;


            }

            if(n==1)
            {
                arr[i][j]=num;
            }

            return arr;
        }


}
