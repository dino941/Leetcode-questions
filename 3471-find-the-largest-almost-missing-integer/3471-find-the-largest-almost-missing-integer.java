class Solution {
    public int largestInteger(int[] nums, int k) {
        int mx=-1,n=nums.length;
        int arr[]=new int[51];

        if(k==1){
            for(int i=0;i<n;i++){
                arr[nums[i]]++;
            }
            for(int i=0;i<51;i++){
                if(i>mx && arr[i]==1) mx=i;
            }
            return mx;
        }else if(k==n){
            for(int i=0;i<n;i++){
                if(nums[i]>mx) mx=nums[i];
            }
            return mx;
        }else{
            int n1=nums[0],n2=nums[n-1];
            for(int i=0;i<n;i++){
                if(nums[i]==n1) arr[n1]++;
                if(nums[i]==n2) arr[n2]++;
            }
            if(arr[n1]==1&&arr[n2]==1){
                return n1>n2?n1:n2;
            }else if(arr[n1]>1&&arr[n2]==1){
                return n2;
            }else if(arr[n1]==1&&arr[n2]>1){
                return n1;
            }else{
                return -1;
            }
        }
    }
}