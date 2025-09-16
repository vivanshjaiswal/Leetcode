class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        // naya array banaya
        vector<int> arr(m + n);
        
        // nums1 ke elements copy karo
        for(int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        
        // nums2 ke elements copy karo
        for(int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }
        
        // pura array sort karo
        sort(arr.begin(), arr.end());
        
        // sorted elements wapas nums1 me copy karo
        for(int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
};
