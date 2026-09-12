class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1){
            return;
        }else if(nums.length == 2){
            int temp = nums[0];
            nums[0]=nums[1];
            nums[1]= temp;
        }
        else{
            int i = nums.length-2;
            int j = nums.length-1;
            while(i>=0 && nums[i]>=nums[i+1]){
                i--;
            }
            if(i>=0){
                while(nums[i]>=nums[j]){
                    j--;
                }
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                Arrays.sort(nums, i+1, nums.length);
            }else{
                Arrays.sort(nums);
            }
        }
    }
}