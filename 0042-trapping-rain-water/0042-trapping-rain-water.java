class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            if(leftMax[i-1]<height[i]){
                leftMax[i]=height[i];
            }
            else{
                leftMax[i]=leftMax[i-1];
            }
        }
        int RightMax[]=new int[n];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            if(RightMax[i+1]<height[i]){
                RightMax[i]=height[i];
            }
            else{
                RightMax[i]=RightMax[i+1];
            }
        }

        int waterlevel;
        int sum=0;
        for(int i =0;i<n;i++){
            waterlevel=(Math.min(leftMax[i],RightMax[i])-height[i]);
            sum+=waterlevel;
        }
        return sum;
    }
}