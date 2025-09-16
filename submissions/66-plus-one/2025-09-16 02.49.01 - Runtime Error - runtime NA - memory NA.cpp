class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        long long num = 0;  // bada integer use karna padega

        // Step 1: array ke digits ko number me convert karo
        for (int d : digits) {
            num = num * 10 + d;
        }

        // Step 2: number me +1 karo
        num += 1;

        // Step 3: number ko wapas array (digits) me tod do
        vector<int> result;
        while (num > 0) {
            int lastDigit = num % 10;   // last digit nikaalo
            result.insert(result.begin(), lastDigit); // shuru me dal do
            num /= 10;
        }

        return result;
    }
};
