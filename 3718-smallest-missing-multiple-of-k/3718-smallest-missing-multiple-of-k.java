class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=0;

        for( i=k;set.contains(i);i+=k);
        return i;
    }
}