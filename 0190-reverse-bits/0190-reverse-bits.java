class Solution {
    public int reverseBits(int n) {
        int[] arr=new int[32];
        int i=0;
        while(n>0){
            int dig=n%2;
            n/=2;
            arr[i]=dig;
            i++;
        }
        int res=0;
        for(int k=0;k<32;k++){
            if(arr[k]==1){
                res=res+(int)Math.pow(2,31-k);
            }
        }
        return res;
    }
}