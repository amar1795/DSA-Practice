package Arrays;

public class row_to_column_zero {

        public int[][] solve(int[][] A) {
            int n = A.length;
            int m = A[0].length;
            int row_Wise[] = new int[n];
            int col_Wise[] = new int[m];
            for(int i = 0; i< n; i++){
                for(int j =0 ; j < m ; j++){
                    if(A[i][j] == 0){
                        row_Wise[i] = -1;
                        col_Wise[j] = -1;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j =0 ;j < m; j++){
                    if(row_Wise [i]== -1|| col_Wise[j] == -1){
                        A[i][j] = 0;
                    }
                }
            }
            return A;
        }
    }

