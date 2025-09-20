class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        sort(nums.begin(), nums.end());   // Array ko sort kar do
        vector<int> result;
        int n = nums.size();
        int i = 0, j = 1;

        while(j <= n){
            // Skip duplicates
            while(i < n && nums[i] < j) i++;
            
            if(i < n && nums[i] == j){
                i++;
            } else {
                result.push_back(j);
            }
            j++;
        }

        return result;
    }
};

