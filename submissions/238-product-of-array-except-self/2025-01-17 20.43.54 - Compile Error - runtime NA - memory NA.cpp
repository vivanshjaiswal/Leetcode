class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> answer(nums.size(),1);
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();){
                int product=0;
                if(i!=j){
                proudct*=nums[j];
                   }   
                   }
                   answer[i]=product;
                   
        }
        return answer;
    }
};