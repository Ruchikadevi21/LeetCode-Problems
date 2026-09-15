class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums;
        }
        int positive[] = new int[n/2];
        int p =0;
        int negative[] = new int[n/2];
        int neg=0;
        for(int i=0; i<n; i++){
            if(nums[i]>0  && p<(n/2)){
                positive[p]=nums[i];
                p++;
            }
            else if(nums[i]<0  && neg<(n/2))
            {
                negative[neg]=nums[i];
                neg++;
            }
        }
        p=0;
        neg=0;
        for(int i=0; i<n; i++){
            if(i%2==0 && p<(n/2)){
                nums[i]=positive[p];
                p++;
            }
            else if(i%2==1 && neg<(n/2))
            {
                nums[i]=negative[neg];
                neg++;
            }
        }
        return nums;
    }
}