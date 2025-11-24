class Solution {
     void generatecandidates(int []candidates,int target,int index,
        List<List<Integer>> result,List<Integer>curr){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        if(index==candidates.length){
            return;
        }
        curr.add(candidates[index]);
        generatecandidates(candidates,target-candidates[index],index,result,curr);
        curr.remove(curr.size()-1);

        generatecandidates(candidates,target,index+1,result,curr);


        }
public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        
       generatecandidates(candidates,target,0,result,curr);
       return result;
        }
    
}