class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0; //for prefixx sum
        int c=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int n:nums){
            sum+=n;
            if(map.containsKey(sum-k)){
                c+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}