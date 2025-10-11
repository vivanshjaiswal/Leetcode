class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs.length==0 || strs==null) return "";

      String prefix=strs[0];
      for(int i=0;i<strs.length;i++){
        int j=0;
        while(j<strs[i].length() && j<prefix.length() && prefix.charAt(j)==strs[i].charAt(j)){
            j++;
        }
        prefix=prefix.substring(0,j);
        if(prefix.isEmpty()){
            return "";
        }
      }
return prefix;
    }
}