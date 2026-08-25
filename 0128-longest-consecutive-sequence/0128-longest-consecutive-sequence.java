class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int c=0;
        for(int n:nums){
            set.add(n);

        }
        for(int n:set){
            if(!set.contains(n-1)){
                int len=1;
                while(set.contains(len+n)){
                    len++;
                }
                c=Math.max(c,len);
            }

        }
        return c;
    }
}