class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;

        if (n == 1) return 1;

        int ans = 1;
        int left = 0;

        for (int right = 1; right < n; right++) {
            int diff = Integer.compare(arr[right], arr[right - 1]);

            // Equal adjacent elements break turbulence.
            if (diff == 0) {
                left = right;
            }
            // If the previous comparison has the same sign,
            // start a new turbulent subarray from right - 1.
            else if (right == 1 ||
                     diff == Integer.compare(arr[right - 1], arr[right - 2])) {
                left = right - 1;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
