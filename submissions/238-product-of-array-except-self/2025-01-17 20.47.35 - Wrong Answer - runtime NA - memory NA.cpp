class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> answer(nums.size(),1);
        for(int i=0;i<nums.size();i++){
           
            for(int j=0;j<nums.size();){
               
                if(i!=j){
             answer[i]*=nums[j];
                   }   
                   }
                   
                   
                   
        }
        return answer;
    }
};