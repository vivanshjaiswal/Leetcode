class Solution {
     public static int sum(int[] nums, int start){
    int s = 0;
    for(int i = start; i < nums.length; i++){
        s += nums[i];
    }
    return s;
}

 public static int countPartitions(int[] nums) {
        ArrayList<Integer>nums2=new ArrayList<>();
        int sum1=0;
        int sum2=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
        int j=i+1;
        nums2.add(nums[i]);
        sum1=sum(nums,j);
        sum2 = sum(nums2.stream().mapToInt(x -> x).toArray(), 0);
        if((sum1-sum2)%2==0){
            count++;
        }
        }
        return count;
    }
}