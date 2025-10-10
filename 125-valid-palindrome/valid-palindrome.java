class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         int low=0;
         int high=s.length()-1;
         while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            else{
            low++;
            high--;
            }
            
         }
   return true; }
}