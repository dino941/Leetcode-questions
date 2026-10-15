class Solution {
    public double findMaxAverage(int[] arr, int k) {
       int  sum=0;
       int maxSum=0;
       //sliding window aproach, ykwim
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            maxSum=Math.max(sum,maxSum);
        }
        return (double)maxSum/k;
    }
}