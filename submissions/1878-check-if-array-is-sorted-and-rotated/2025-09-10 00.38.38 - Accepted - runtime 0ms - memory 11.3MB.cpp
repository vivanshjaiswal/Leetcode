class Solution {
public:
    bool check(vector<int>& nums) {
        int n=nums.size();
        int Check=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                Check++;
            }
            if(Check>1) return false;
        }
        return true;
    }
};