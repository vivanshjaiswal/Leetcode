class Solution {
    public boolean hasAllCodes(String s, int k) {
        int totalCodes=1<<k;
        HashSet<String>presentSets=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String sub=s.substring(i,i+k);
            presentSets.add(sub);
        }
       return presentSets.size()==totalCodes;
    }
}