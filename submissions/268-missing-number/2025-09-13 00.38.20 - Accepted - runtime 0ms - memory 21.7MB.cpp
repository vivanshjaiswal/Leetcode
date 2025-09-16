class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int currSum=0;
       int n=nums.size();
     int osum=((n*(n+1))/2);
     for(int i=0;i<n;i++){
    currSum+=nums[i];
     }
     return (osum-currSum);
    }
};