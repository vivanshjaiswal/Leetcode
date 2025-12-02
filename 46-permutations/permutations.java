class Solution {
    public List<List<Integer>> permute(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
          boolean [] used=new boolean[nums.length];
        backtrack(nums,new ArrayList<>(),used,ans);
        return ans;
    }

//--------Backtracking Function-------
void backtrack(int nums[],List<Integer>curr,boolean [] used,List<List<Integer>>ans){
    if(curr.size()==nums.length){
        ans.add(new ArrayList<>(curr));
        return;
    }
    for(int i=0;i<nums.length;i++){
     if(!used[i]){
        used[i]=true;
        curr.add(nums[i]);
        backtrack(nums,curr,used,ans);
        curr.remove(curr.size()-1);
        used[i]=false;
     }
    }

  }
}