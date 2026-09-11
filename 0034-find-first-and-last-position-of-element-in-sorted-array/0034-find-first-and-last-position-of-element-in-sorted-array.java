class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        int left = 0;
        int right = n-1;
        int arr[]= {-1,-1};
        int mid;
        if(n==1){
            if(nums[0] == target){
                arr[0]=0;
                arr[1]=0;
                return arr;
            }
            else{
                return arr;
            }
        }
        while(left<=right){
            mid = right+((left-right)/2);
            if(nums[mid] == target){
                int i = mid;
                int j =mid;
                while(j>=0 && nums[j] == target){
                    j--;
                }
                while(i<n && nums[i] == target){
                    i++;
                }
                arr[0] = j+1;
                arr[1] = i-1;
                return arr;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return arr;
    }
}