class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int aux[]= new int[n];
        int count=0;
        for(int i=0;i<n; i++){
            if(nums[i]==k){
                count++;
            }
        }
        aux[0]=nums[0];
        for(int i=1;i<n; i++){
            aux[i]=aux[i-1]+nums[i];
            if(aux[i]==k){
                count++;
            }
        }
        for(int i=1; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(aux[j]-aux[i-1] == k){
                    count++;
                }
            }
        }
        return count;
    }
}