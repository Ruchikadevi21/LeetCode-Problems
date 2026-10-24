class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=0;
        int a=x;
        while(a>0){
            num=num*10+a%10;
            a/=10;
        }
        return num==x;
    }
}