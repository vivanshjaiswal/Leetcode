class Solution {
    public int maximumDifference(int[] nums) {
        //Optimal Using Greedy Algorithm
        int min=nums[0];
       int maxDiff=-1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>min){
          int currDiff=nums[i]-min;
          maxDiff=Math.max(currDiff,maxDiff);
        }
        else{
            min=nums[i];
        }
       }
return maxDiff;
    }
}