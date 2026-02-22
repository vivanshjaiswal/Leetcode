class Solution {
    public int binaryGap(int n) {
        boolean isVisited=false;
        int curr_dist=0;
        int maxDist=0;
        while(n>0){
            int bit=n%2;
            if(bit==1){
                if(isVisited){
                    maxDist=Math.max(maxDist,curr_dist);
                }
                isVisited=true;
                curr_dist=1;
            }
            else{
                curr_dist++;
            }
            n=n/2;
        }
        return maxDist;
    }
}