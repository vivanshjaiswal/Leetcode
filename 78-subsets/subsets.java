class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        generate(nums, 0, curr, result);
        return result;
    }

    void generate(int[] nums, int index, List<Integer> curr, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        // exclude
        generate(nums, index + 1, curr, result);

        // include
        curr.add(nums[index]);
        generate(nums, index + 1, curr, result);

        // backtrack
        curr.remove(curr.size() - 1);
    }
}
