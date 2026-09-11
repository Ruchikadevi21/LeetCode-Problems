class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int left =0;
        int right = nums.length-1;
        int mid=-1;
        while(right>=left){
            mid = right +((left-right)/2);
            if((mid-1)>=0 && nums[mid] == nums[mid-1]){
                if(((mid-1)-left)%2 != 0){
                    right = mid-2;
                }else{
                    left = mid +1;
                }
            }
            else if((mid+1)<nums.length && nums[mid]==nums[mid+1]){
                if(((mid+1)-right)%2 != 0){
                    left = mid+2;
                }
                else{
                    right = mid-1;
                }
            }
            else{
                return nums[mid];
            }
        }
        return mid;
    }
}