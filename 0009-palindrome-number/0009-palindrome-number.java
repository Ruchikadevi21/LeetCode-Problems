class Solution {
    public boolean isPalindrome(int x) {
        int a =x;
        int ans=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int num = x%10;
            ans = ans*10+num;
            x = x/10;
        }
        boolean b;
        if(ans == a){
            b = true;
        }else{
            b= false;
        }
        return b;
    }
}