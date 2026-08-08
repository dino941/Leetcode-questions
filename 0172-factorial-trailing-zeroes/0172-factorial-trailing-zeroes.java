class Solution {
    public int trailingZeroes(int n) {
        int f=5;
        int z=0;
        while(n/f!=0){
            z+=n/f;
            f*=5;
        }
        return z;
    }
}