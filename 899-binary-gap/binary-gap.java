class Solution {
    public int binaryGap(int n) {
        boolean isVisited=false;
        int curr_dist=0;
        int maxDist=0;
        String num="";
        while(n>0){
         int remainder=n%2;
         num=num+remainder;
        n=n/2;
        
        }
             for(int i=0;i<num.length();i++){
                 char bit=num.charAt(i);
            if(bit=='1'){
                if(isVisited){
                    maxDist=Math.max(maxDist,curr_dist);
                }
                isVisited=true;
                curr_dist=1;
            }
            else{
                curr_dist++;
            }
            
        }
        return maxDist;
    }
}