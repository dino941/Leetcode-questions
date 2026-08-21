class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        long sum=0;
        long mx=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(r-l+1>k){
                int le=nums[l];
                sum=sum-le;
                map.put(le,map.get(le)-1);
                if(map.get(le)==0){
                    map.remove(le);
                }
                l++;
            }
            if(r-l+1==k){
                if(map.size()==k){
                    mx=Math.max(sum,mx);
                }
            }
        }
        return mx;
    }
}