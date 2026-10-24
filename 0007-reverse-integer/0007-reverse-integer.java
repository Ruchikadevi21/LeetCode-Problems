class Solution {
    public int reverse(int x) {
        int flag=0;
        if(x<0){
            flag=1;
            x*=-1;
        }
        long num=0;
        while(x>0){
            num=num*10+x%10;
            x/=10;
        }
        if(flag==1){
            num*=-1;
        }
        if(num>Math.pow(2,31)-1 || num<(Math.pow(2,31)*(-1)) ){
            num=0;
        }
        return (int)num;
    }
}