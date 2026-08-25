class Solution {
    public int myAtoi(String s) {
        int i=0,n=s.length();
        //space ignore maro
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        int sign=1; //kya ye -ve hai ya +ve
        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        long res=0; 
        while(i<n&&(s.charAt(i)>='0'&&s.charAt(i)<='9')){
            res=res*10+(s.charAt(i)-'0');
            if(sign==1&&res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign==-1&&-res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*res);
    }
}