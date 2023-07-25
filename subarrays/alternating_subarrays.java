package subarrays;

public class alternating_subarrays {


        public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
            ArrayList<Integer> ans = new ArrayList<>();
            int n = A.size();
            int twoB = 2 * B;
            int count = 1;

            if (B == 0) {
                for (int i=0; i<n; i++) {
                    ans.add(i);
                }
                return ans;
            }
            for (int i=1; i<n; i++) {
// check if alternating
                if (A.get(i) != A.get(i-1)) {
// incrementing the counter only when alternating
                    count++;
                    if (count > twoB) {
// if counter is greater than 2 * B, and still alternating, hence adding the centre which is current index(i) - B
                        ans.add(i-B);
                    }
                } else {
// if not alternating, reseting the counter
                    count = 1;
                }
            }
            return ans;
        }


}
