class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        visited[0]=true;
        dfs(rooms,visited,0);
        for(boolean b:visited){
            if(!b) return false;
        }
        return true;
    }
    void dfs(List<List<Integer>> graph,boolean[] visited,int src){
        for(int nbr:graph.get(src)){
            if(!visited[nbr]){
                visited[nbr]=true;
                dfs(graph,visited,nbr);
            }
        }
    }
}