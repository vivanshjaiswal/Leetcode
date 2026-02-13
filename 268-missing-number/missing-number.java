class Solution {
    public boolean linearSearch(int [] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
    public int missingNumber(int[] nums) {
        //Brute Force Approach

        for(int i=0;i<nums.length;i++){
            if(!linearSearch(nums,i)){
                return i;
            }

        }
        return nums.length;
    }   
}