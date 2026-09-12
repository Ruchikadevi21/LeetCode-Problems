class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> mainList = new ArrayList<>();
        if(n<=2){
            return mainList;
        }
        if(n==3){
            if(nums[0]+nums[1]+nums[2]==0){
                List<Integer> List = new ArrayList<>();
                    List.add(nums[0]);
                    List.add(nums[1]);
                    List.add(nums[2]);
                    mainList.add(List);
                    return mainList;        
            }else{
                return mainList;
            }
        }
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i>0 &&  nums[i] == nums[i-1]){
                continue;
            }
            int lp = i+1;
            int rp = n-1;
            
            while(lp<rp){
                int sum = nums[i]+nums[lp]+nums[rp];
                if( sum == 0){
                    List<Integer> List = new ArrayList<>();
                    List.add(nums[i]);
                    List.add(nums[lp]);
                    List.add(nums[rp]);
                    mainList.add(List);
                    lp++;
                    rp--;
                    while(lp < rp && nums[lp] == nums[lp-1]) lp++;
                    while(lp < rp && nums[rp] == nums[rp+1]) rp--;
                }
                else if(sum < 0 ){
                    lp++;
                }
                else{
                    rp--;
                }
            }
            
        }
        return mainList;
    }
}