class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<=right){
            while(left<=right && left<nums.length-1 && nums[left] == nums[left+1]){
                left++;
            }
            while(left<=right && right>0 && nums[right] == nums[right-1]){
                right--;
            }
            mid = right+((left-right)/2);
           
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid]>nums[left]){
                if(nums[mid]>target && nums[left] <= target){
                    right = mid-1;
                } 
                else{
                    left = mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[right] >= target){
                    left = mid+1;
                } 
                else{
                    right = mid-1;
                }
            }
            
        }
        return false;
    }
}