class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        if(nums.empty()) return 0;

        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<int> freq;
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                freq.push_back(count);
                count = 1;
            }
        }
        freq.push_back(count); // last group

        int maxFreq = *max_element(freq.begin(), freq.end());
        int total = 0;

        for(int f : freq) {
            if(f == maxFreq) total += f;
        }

        return total;
    }
};
