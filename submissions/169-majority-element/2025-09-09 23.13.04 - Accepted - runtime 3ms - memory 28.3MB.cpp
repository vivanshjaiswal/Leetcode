class Solution {
public:
    int majorityElement(vector<int>& nums) {
       sort(nums.begin(), nums.end());
        int count =1;
        int n=nums.size();
        for(int i=1;i<nums.size();i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return nums[n/2];
    }
};