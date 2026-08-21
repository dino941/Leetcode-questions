class Solution {
    List<List<Integer>> lst;
    public List<List<Integer>> subsets(int[] nums) {
        lst=new ArrayList<>();

        backtrack(new ArrayList<>(),nums,0);
        return lst;

    }
    public void backtrack(List<Integer> tmp,int[] arr,int i){
        if(i>=arr.length){
            lst.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(arr[i]);
        backtrack(tmp,arr,i+1);
        tmp.remove(tmp.size()-1);
        backtrack(tmp,arr,i+1);

    }
}