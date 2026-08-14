class Solution {
    public double findMaxAverage(int[] arr, int k) {
       int  sum=0;
       int maxSum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum=sum;
        int l=0;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[l];
            maxSum=Math.max(sum,maxSum);
            l++;
        }
        return (double)maxSum/k;
    }
}