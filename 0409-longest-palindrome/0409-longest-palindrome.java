class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }        
        int c=0;
        boolean od=false;
        for(int n:map.values()){
            if(n%2==0){
                c+=n;
            }else{
                c=c+n-1;
                od=true;
            }
        }
        return od?c+1:c;
    }
}