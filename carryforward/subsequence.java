package carryforward;

public class subsequence {
    public int solve(String A) {
        int sum=0;
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='A')
            {
                sum++;
            }

            if(A.charAt(i)=='G')
            {
                count+=sum;
            }

            count=count%1000000007;

        }

        return count%1000000007;
    }
}

public class Solution {
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
                    ans = (ans > diff) ? diff : ans;
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




