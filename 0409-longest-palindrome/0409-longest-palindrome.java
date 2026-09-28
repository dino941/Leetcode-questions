class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[52];
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
            arr[c-'a']++;
            }else{
                arr[c-'A'+26]++;
            }
        }        
        int c=0;
        boolean od=false;
        for(int n:arr){
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