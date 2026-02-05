class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nextGreater = new int[n];
        Stack<Integer> S = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!S.isEmpty() && S.peek() <= nums[idx]) {
                S.pop();
            }

            if (i < n) {
                nextGreater[idx] = S.isEmpty() ? -1 : S.peek();
            }

            S.push(nums[idx]);
        }
        return nextGreater;
    }
}
