class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n=nums.size();
        int l=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=0){
                swap(nums[i],nums[l]);
         l++;
            }
            else{
                l++;
            }
        }
    }
};