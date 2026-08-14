class Solution {
    public int maxFrequencyElements(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int n:arr){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int max=-1;
        for(int n:mp.keySet()){
            max=Math.max(max,mp.get(n));
        }
        int c=0;
        for(int n:mp.keySet()){
            if(mp.get(n)==max){
                c+=max;
            }
        }
        return c;
    }
}