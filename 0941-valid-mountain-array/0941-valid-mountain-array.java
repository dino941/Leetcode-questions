class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }
        int l=0,n=arr.length;
        while(l<n-1&&arr[l]<arr[l+1]) l++;
        if(l==0||l==n-1) return false;
        while(l<n-1&&arr[l]>arr[l+1]) l++;
        return l==n-1;
    }
}