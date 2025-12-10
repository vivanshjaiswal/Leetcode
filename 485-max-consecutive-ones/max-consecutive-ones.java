class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int count=0;
     int curr_count=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            curr_count++;
            count=Math.max(curr_count,count);
        }
        else{
            curr_count=0;
        }
     } 

   return count; }
}