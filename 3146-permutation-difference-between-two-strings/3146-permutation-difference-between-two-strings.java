class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            sum=sum+Math.abs(i-map.get(t.charAt(i)));
        }
        return sum;
    }
}