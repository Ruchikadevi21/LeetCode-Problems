class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int maxarea =0;
        int end = height.length-1;
        while(start<end){
            int minHeight = Math.min(height[start], height[end]);
            maxarea = Math.max(maxarea, minHeight*(end-start));
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        
        return maxarea;
    }
}