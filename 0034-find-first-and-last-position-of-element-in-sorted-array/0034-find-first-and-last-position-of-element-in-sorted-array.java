class Solution {
    public int[] searchRange(int[] arr, int target) {
        int fir=findInd(arr,target,true);
        int last=findInd(arr,target,false);
        return new int[]{fir,last};
    }
    public int findInd(int arr[],int target,boolean isFir){
        int l=0,r=arr.length-1;
        int res=-1;
        while(l<=r){
            int mid=(l+r)/2;
            
            if(arr[mid]==target){
                res=mid;
                if(isFir){
                    r=mid-1;
                }else{
                    l=mid+1;
                    
                }
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}