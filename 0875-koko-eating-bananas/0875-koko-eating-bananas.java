class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=piles[0];
        for(int n:piles){
            if(n>r) r=n;
        }
        while(l<r){
            int mid=(l+r)/2;
            if(isEnough(piles,h,mid)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean isEnough(int[] arr,int h,int k){
        int c=0;
        for(int n:arr){
            if(n%k==0){
                c=c+(n/k);
            }else{
                c=c+(n/k)+1;
            }
        }
        
        return c<=h;
    }
}