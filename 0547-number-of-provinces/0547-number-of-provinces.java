class Solution {
    public int findCircleNum(int[][] arr) {
        boolean visited[]=new boolean[arr.length];
        int pr=0;
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                pr++;
                dfs(arr,i,visited);
            }
        }
        return pr;
    }
    void dfs(int[][] arr,int v,boolean[] visited){
        visited[v]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[v][i]==1&&!visited[i]){
                dfs(arr,i,visited);
            }
        }

    }
}