class Solution {
    public boolean linear_search(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!linear_search(nums, i)) {
                return i;
            }
        }
        return nums.length;
    }
}
