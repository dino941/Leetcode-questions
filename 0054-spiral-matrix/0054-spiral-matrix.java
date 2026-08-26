class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        
        List<Integer> lst=new ArrayList<>();
        int top=0,bot=m-1;
        int l=0,r=n-1;
        while(top<=bot&&l<=r){
            for(int i=l;i<=r;i++){
                lst.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                lst.add(mat[i][r]);
            }
            r--;
            if(top<=bot){
            for(int i=r;i>=l;i--){
                lst.add(mat[bot][i]);
            }
            bot--;
            }
            if(l<=r){
                for(int i=bot;i>=top;i--){
                    lst.add(mat[i][l]);
                }
                l++;
            }
        }
        return lst;
    }
}