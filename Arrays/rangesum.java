package Arrays;

public class rangesum {
    public int[] solve(int[] A, int[][] B) {
        int len = A.length;
        int M = B.length;
        int[] arr={0};
        arr= new int[M];
        for(int i=0;i<M;i++){
            for(int j=B[i][0];j<=B[i][1];j++){
                arr[i]=arr[i]+A[j];
            }

        }
        return arr;
    }
}
