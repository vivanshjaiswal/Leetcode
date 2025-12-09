class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        // Count zeroes
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count++;
        }

        // Shift elements left whenever zero found
        for (int i = 0; i < nums.length - count; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--; 
            }
        }

        // Insert zeroes at the end
        for (int i = nums.length - count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
