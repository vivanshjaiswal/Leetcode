
//     public void rotate(int[] nums, int k) {
//           k=k%nums.length;
//         int arr1[]=Arrays.copyOfRange(nums, 0,k);
//         if(nums.length==0){
//            return;
//         }
        
//         //Shifting is done for left ---
//         for(int i=k;i<nums.length;i++){
//             nums[i-k]=nums[i];
//         }
//         //Inserting the element the remaining element in the last----
//         for(int i=0;i<k;i++){
//             nums[nums.length-k+i]=arr1[i];
//     }
// } 
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0) return;

        k = k % nums.length;

        int arr1[] = Arrays.copyOfRange(nums, nums.length - k, nums.length);

        for(int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for(int i = 0; i < k; i++) {
            nums[i] = arr1[i];
        }
    }
}

