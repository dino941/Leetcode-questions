class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<>();
        for(int n:friends){
            set.add(n);
        }
        int[] res=new int[friends.length];
        int i=0;
        for(int n:order){
            if(set.contains(n)){
                res[i++]=n;
            }
        }
        return res;
    }
}