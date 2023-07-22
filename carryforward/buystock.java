package carryforward;


    public class buystock {
        public int maxProfit(final int[] A) {
            int n = A.length;

            if (n == 0) {
                return 0; // Return 0 if the array is empty
            }

            int min = A[0];
            int profit = 0;

            for(int i = 0; i < n-1; i++) {
                if(min > A[i]) {
                    min = A[i];
                }

                int max = A[i+1] - min;
                profit = Math.max(max, profit);
            }

            return profit;

        }

    }


