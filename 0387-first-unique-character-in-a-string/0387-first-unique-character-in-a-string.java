class Solution {
    public int firstUniqChar(String s) {
       int[] srr=new int[26];
       int n=s.length();
       for(int i=0;i<n;i++){
        srr[s.charAt(i)-'a']++;
       }
       for(int i=0;i<n;i++){
        if(srr[s.charAt(i) - 'a']==1){
            return i;
        }
       }
       return -1;
    }
}