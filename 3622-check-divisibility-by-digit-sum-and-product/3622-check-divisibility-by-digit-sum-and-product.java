class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,p=1;
        int tmp=n;
        while(n>0){
            int d=n%10;
            sum+=d;
            p*=d;
            n/=10;
        }
        return tmp%(sum+p)==0;
    }
}