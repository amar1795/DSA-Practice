package Arrays;

public class multiple_occurence {

    public class Solution {
        public int solve(int[] A, int B) {
            int count=0;

            int n=A.length;
            for(int i=0;i<n;i++)
            {
                if(A[i]==B)
                {
                    count++;
                }
            }
            return count;
        }
    }

}
