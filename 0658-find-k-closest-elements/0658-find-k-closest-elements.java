class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0,r=arr.length-1;
        List<Integer> lst=new ArrayList<>();
        while(r-l>=k){
            if(Math.abs(arr[l]-x)>Math.abs(arr[r]-x)){
                l++;
            }else{
                r--;
            }
        }
        for(int i=l;i<=r;i++){
            lst.add(arr[i]);
        }
        return lst;
    }
}