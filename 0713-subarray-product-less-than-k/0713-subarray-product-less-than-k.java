class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int c=0,p=1;
        int l=0;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            while(p>=k){
                p/=nums[l++];
            }
            c+=i-l+1;

        }
        return c;
    }
}