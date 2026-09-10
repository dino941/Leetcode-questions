class Solution {
    public int majorityElement(int[] nums) {
        int c=0,can=0;
        int n=nums.length;
        for(int num:nums){
            if(c==0){
                can=num;
            }
            c+=(can==num)?1:-1;
        }
        return can;
        
    }
}