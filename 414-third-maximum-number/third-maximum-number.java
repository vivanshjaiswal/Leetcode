import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);  // ascending sort

        int count = 1;  
        int last = nums[nums.length - 1]; // biggest element

        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != last) { 
                count++;
                last = nums[i];
                if(count == 3) {
                    return nums[i];
                }
            }
        }

        return nums[nums.length - 1]; // agar 3 unique max nahi mile
    }
}
