class Solution {
    public int[][] generateMatrix(int n) {
        int i=1;
        int arr[][]=new int[n][n];
        int t=0,b=n-1;
        int l=0,r=n-1;
        while(i<=n*n){
            for(int j=l;j<=r;j++){
                arr[t][j]=i;
                i++;
            }
            t++;
            for(int j=t;j<=b;j++){
                arr[j][r]=i;
                i++;
            }
            r--;
            if(t<=b){
                for(int j=r;j>=l;j--){
                    arr[b][j]=i;
                    i++;
                }
                b--;
            }
            if(l<=r){
                for(int j=b;j>=t;j--){
                    arr[j][l]=i;
                    i++;
                }
                l++;
            }
        }
        return arr;
    }
}