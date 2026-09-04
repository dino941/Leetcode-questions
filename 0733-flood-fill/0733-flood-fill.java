class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int color) {
        dfs(img,sr,sc,color,img[sr][sc]);
        return img;
    }
    void dfs(int[][] img,int i,int j,int newColor,int orgColor){
        if(i<0||j<0||i>=img.length||j>=img[0].length||img[i][j]==newColor||img[i][j]!=orgColor){
            return;
        }
        img[i][j]=newColor;
        dfs(img,i-1,j,newColor,orgColor);//up
        dfs(img,i+1,j,newColor,orgColor);//down
        dfs(img,i,j-1,newColor,orgColor);//left
        dfs(img,i,j+1,newColor,orgColor);//right
    }
}