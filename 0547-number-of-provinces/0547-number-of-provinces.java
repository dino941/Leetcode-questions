class Solution {
    public int findCircleNum(int[][] arr) {
        boolean visited[]=new boolean[arr.length];
        int pr=0;
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                pr++;
                dfs(arr,visited,i);
            }
        }
        return pr;
    }
    void dfs(int[][] arr,boolean[] visited,int src){
        visited[src]=true;
        for(int nbr=0;nbr<arr.length;nbr++){
            if(arr[src][nbr]==1&&!visited[nbr]){
                dfs(arr,visited,nbr);
            }
        }
    }
}