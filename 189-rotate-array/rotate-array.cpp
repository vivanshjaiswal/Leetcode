class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n;  // k agar n se bada ho to handle karega
        
        // reverse full array
        reverse(nums.begin(), nums.end());
        // reverse first k elements
        reverse(nums.begin(), nums.begin() + k);
        // reverse remaining n-k elements
        reverse(nums.begin() + k, nums.end());
    }
};
