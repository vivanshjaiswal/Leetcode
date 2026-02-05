class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] nge = new int[n];
        Stack<Integer> S = new Stack<>();

        // Step 1: Next Greater for nums2
        for (int i = n - 1; i >= 0; i--) {
            while (!S.isEmpty() && S.peek() <= nums2[i]) {
                S.pop();
            }
            nge[i] = S.isEmpty() ? -1 : S.peek();
            S.push(nums2[i]);
        }

        // Step 2: Answer for nums1 (without HashMap)
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < n; j++) {
                if (nums2[j] == nums1[i]) {
                    ans[i] = nge[j];
                    break;
                }
            }
        }
        return ans;
    }
}
