class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> result;
        int n = nums.size();
        int i = 0;

        while (i < n) {
            int start = nums[i];  // range ka start
            int j = i;

            // consecutive numbers check karna
            while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
                j++;
            }

            int end = nums[j];  // range ka end

            // range ko string me add karna
            if (start == end) {
                result.push_back(to_string(start));
            } else {
                result.push_back(to_string(start) + "->" + to_string(end));
            }

            i = j + 1;  // next range ke start pe jump
        }

        return result;
    }
};
