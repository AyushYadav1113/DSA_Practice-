class Solution {
    public int largestElement(int[] nums) {
        int largestElement = nums[0]; // Initialize with first element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largestElement) {
                largestElement = nums[i]; // Update when a larger number is found
            }
        }
        return largestElement;
    }
}
