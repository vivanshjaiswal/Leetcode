class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, target, candidates, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int index, int target, int[] arr, 
                   List<Integer> curr, List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (index >= arr.length) return;

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) continue; // skip duplicates

            if (arr[i] > target) break;

            curr.add(arr[i]);
            backtrack(i + 1, target - arr[i], arr, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
