class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int cmx=arr[0],mx=arr[0];
        int cmin=arr[0],mn=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            cmx=Math.max(arr[i],arr[i]+cmx);
            mx=Math.max(cmx,mx);
            cmin=Math.min(arr[i],arr[i]+cmin);
            mn=Math.min(cmin,mn);
            sum+=arr[i];
        }
        if(mx<0){
            return mx;
        }
        return Math.max(mx,sum-mn);
    }
}