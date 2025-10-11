class Solution {
    public String largestOddNumber(String num) {
        int largestoddindex=-1;
        for(int i=0;i<num.length();i++){
            if((num.charAt(i)-'0')%2!=0){
                largestoddindex=i;
            }
        }
        if(largestoddindex==-1){
            return "";
        }
        else {
            return num.substring(0,largestoddindex+1);
        }
    }
}