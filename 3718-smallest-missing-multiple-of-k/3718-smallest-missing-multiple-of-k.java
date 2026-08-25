class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int tmp=k;
        for(int i=k;set.contains(tmp);i+=k){
            tmp=i;
        }
        return tmp;
    }
}