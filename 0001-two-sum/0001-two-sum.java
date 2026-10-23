class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=nums.length-1; i>=0; i--){
            // if(nums[i]>target){
            //     i--;
            // }
            for(int j=i-1; j>=0;j--){
                if(nums[i]+nums[j]==target){
                    arr[0]=j;
                    arr[1]=i;
                    break;
                }
            }
        }
        return arr;
    }
}