class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> lst=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
           int dif=Math.abs(b-x)-Math.abs(a-x);
           if(dif==0) return b-a;
           return dif;
        });
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
            lst.add(arr[i]);
            if(pq.size()>k){
                lst.remove(pq.poll());
            }
        }
        return lst;
    }
}