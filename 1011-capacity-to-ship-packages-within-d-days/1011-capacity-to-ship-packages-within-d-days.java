class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int n:weights){
            l=Math.max(l,n);
            r+=n;
        }
        while(l<r){
            int mid=(l+r)/2;
            if(posible(weights,days,mid)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    boolean posible(int arr[],int d,int w){
        int sum=0,c=1;
        for(int n:arr){
            if(sum+n>w){
                sum=0;
                c++;
            }
            sum+=n;
        }
        return c<=d;
    }
}