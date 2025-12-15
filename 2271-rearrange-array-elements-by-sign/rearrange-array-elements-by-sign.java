class Solution {
    public int[] rearrangeArray(int[] nums) {
     int n=nums.length;
     int []pos=new int [n/2];
     int []neg=new int [n/2];
     int []ans=new int [n];
     int p=0,q=0;
     for(int x:nums){
        if(x>0) pos[p++]=x;
        else{
            neg[q++]=x;}
     }
     int i=0,j=0,k=0;
     while(k<n){
     ans[k++]=pos[i++];
     ans[k++]=neg[j++];
     
     }
     return ans;
    }
}