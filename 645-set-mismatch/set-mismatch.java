class Solution {
    public int[] findErrorNums(int[] nums) {
int n = nums.length;
Arrays.sort(nums);
int repeating = 0;
int missing = 0;

for (int i = 1; i < n; i++) {
    if (nums[i] == nums[i - 1]) {
        repeating = nums[i];
    } else if (nums[i] != nums[i - 1] + 1) {
        missing = nums[i - 1] + 1;
    }
}

if (missing == 0) {
    if (nums[0] != 1) {
        missing = 1;
    } else {
        missing = n;
    }
}

return new int[]{repeating, missing};

    }
}