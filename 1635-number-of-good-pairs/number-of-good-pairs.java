class Solution {
    public int numIdenticalPairs(int[] nums) {
        int []freq=new int [101];
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            count =count+freq[x];
            freq[x]++;

        }
        return count;

    }
}