package carryforward;


    public class closestminmax {
        public int solve(int[] A) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < A.length; i++){
                if(A[i] > max){
                    max = A[i];
                }
                if(A[i] < min){
                    min = A[i];
                }
            }
            int latest_max = -1;
            int latest_min = -1;
            int ans = Integer.MAX_VALUE;
            for(int i = 0; i < A.length; i++){
                if(A[i] == max){
                    latest_max = i;
                    if(latest_min != -1){
                        int diff = Math.abs(latest_max - latest_min) + 1;
                        ans = (ans > diff) ? diff : ans;//to handle the edge case where there are multiple min max subarray and to find the smallest one
                    }
                }
                if(A[i] == min){
                    latest_min = i;
                    if(latest_max != -1){
                        int diff = Math.abs(latest_max - latest_min) + 1;
                        ans = (ans > diff) ? diff : ans;
                    }
                }
            }
            return ans;
        }
    }


