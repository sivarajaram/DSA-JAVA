class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        // Step 1: Create leftMax and rightMax arrays
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Step 2: Fill leftMax array
        leftMax[0] = height[0]; // First element is same
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Step 3: Fill rightMax array
        rightMax[n - 1] = height[n - 1]; // Last element is same
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Step 4: Calculate trapped water at each index
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterAtI = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (waterAtI > 0) {
                totalWater += waterAtI;
            }
        }

        return totalWater;
    }
}
