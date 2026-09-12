class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n=nums.length;
        if(n==1){
            list.add(nums[0]);
            return list;
        }
        if(n==2){
            if(nums[0] == nums[1]){
                list.add(nums[0]);
            }else{
                list.add(nums[0]);
                list.add(nums[1]);
            }
            return list;
        }
        int max=0;
        int min=0;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                if(max<nums[i]){
                    max=nums[i];
                }
            }
            else if(nums[i]<0){
                if(min>nums[i]){
                    min=nums[i];
                }
            }
        }
        int count[] = new int[max-min+1];
        for(int i=0; i<n; i++){
            count[nums[i]-min]++;
        }
        for(int i=0; i<count.length; i++){
            if(count[i]>(n/3)){
                list.add(i+min);
            }
        }
        return list;
    }
}