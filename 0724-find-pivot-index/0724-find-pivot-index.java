class Solution {
    public int pivotIndex(int[] nums) {
        int pre[]=new int[nums.length];
        pre[0]=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            pre[i]=nums[i]+pre[i-1];
        }
        int ls=0,rs=0;
        for(int i=0;i<n;i++){
            ls=pre[i]-nums[i];
            rs=pre[n-1]-pre[i];
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}