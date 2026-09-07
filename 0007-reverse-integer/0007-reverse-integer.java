class Solution {
    public int reverse(int x) {
        int a=x;
        long ans=0;
        if(x<0){
            x*=(-1);
        }
        while(x>0){
            int num = x%10;
            ans = ans*10+num;
            x = x/10;
        }
        if(a<0){
            ans = ans*(-1);
        }
        if(ans>=Math.pow(2,31)-1 || ans <= -(Math.pow(2,31))){
            ans = 0;
        }
        return (int)ans;
    }
}