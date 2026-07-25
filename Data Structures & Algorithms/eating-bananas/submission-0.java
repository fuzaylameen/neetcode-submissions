class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // Find the maximum pile size
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            long hours = 0;

            // Calculate hours needed at speed = mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // This speed works, try a smaller one
                right = mid;
            } else {
                // Too slow, need a higher speed
                left = mid + 1;
            }
        }

        return left;
    }
}