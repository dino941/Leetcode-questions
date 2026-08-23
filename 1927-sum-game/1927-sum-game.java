class Solution {
    public boolean sumGame(String num) {
        int n=num.length(),half=n/2;
        int sum1=0,sum2=0,ct1=0,ct2=0;
        for(int i=0;i<half;i++){
            if(num.charAt(i)=='?'){
                ct1++;
            }else{
                sum1+=num.charAt(i)-'0';
            }
        }
        for(int i=half;i<n;i++){
            if(num.charAt(i)=='?'){
                ct2++;
            }else{
                sum2+=num.charAt(i)-'0';
            }
        }
        if((ct1+ct2)%2!=0) return true;
        return 2*(sum1-sum2)!=9*(ct2-ct1);
    }
}