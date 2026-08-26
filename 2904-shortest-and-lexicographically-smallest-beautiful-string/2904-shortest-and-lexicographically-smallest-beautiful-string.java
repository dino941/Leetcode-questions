class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int len=Integer.MAX_VALUE;
        int l=0,c=0;;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='1') c++;
            while(c>=k){
                if(c==k) len=Math.min(len,r-l+1);
                if(s.charAt(l)=='1') c--;
                l++;
            }
        }
        if(len==Integer.MAX_VALUE) return "";
        c=0;
        l=0;
        String ans=null;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='1') c++;
            while(c>=k){
                if(c==k&&(r-l+1)==len){
                    String tmp=s.substring(l,r+1);
                    if(ans==null||tmp.compareTo(ans)<0){
                        ans=tmp;
                    }

                }
                if(s.charAt(l)=='1') c--;
                l++;
            }
        }
        return ans;
    }
}