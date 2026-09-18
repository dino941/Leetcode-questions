class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        ArrayList<Integer>[] graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }
        int[] indegree=new int[numCourses];
        for(int[] edge:pre){
            int course=edge[0];
            int pr=edge[1];
            graph[pr].add(course);
            indegree[course]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        int c=0;
        while(!queue.isEmpty()){
            int cur=queue.remove();
            c++;
            for(int ngh:graph[cur]){
                indegree[ngh]--;
                if(indegree[ngh]==0){
                    queue.add(ngh);
                }
            }
        }
        return c==numCourses;
    }
}