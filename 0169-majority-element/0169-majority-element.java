class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int e = (int)(n/2);
        return nums[e];
    }
}