class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=0;
        int a=x;
        while(a>0){
            int rem = a%10;
            num=num*10+rem;
            a/=10;
        }
        if(num==x){
            return true;
        }
        return false;
    }
}