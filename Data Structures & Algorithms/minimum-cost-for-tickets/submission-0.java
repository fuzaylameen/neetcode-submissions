class Solution {

    public int mincostTickets(int[] days, int[] costs) {

        int n = days.length;

        int[] dp = new int[n + 1];

        // dp[n] = 0
        // No travel days remaining.

        for (int i = n - 1; i >= 0; i--) {

            // -------------------------
            // Option 1: 1-day pass
            // -------------------------

            int next1 = i + 1;

            int cost1 = costs[0] + dp[next1];


            // -------------------------
            // Option 2: 7-day pass
            // -------------------------

            int next7 = i;

            while (next7 < n &&
                   days[next7] < days[i] + 7) {

                next7++;
            }

            int cost7 = costs[1] + dp[next7];


            // -------------------------
            // Option 3: 30-day pass
            // -------------------------

            int next30 = i;

            while (next30 < n &&
                   days[next30] < days[i] + 30) {

                next30++;
            }

            int cost30 = costs[2] + dp[next30];


            // Choose minimum
            dp[i] = Math.min(
                cost1,
                Math.min(cost7, cost30)
            );
        }

        return dp[0];
    }
}
