class Solution {
    public int findMaxLength(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int mx=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]==0?-1:1);
            if(map.containsKey(sum)){
                mx=Math.max(mx,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return mx;
    }
}