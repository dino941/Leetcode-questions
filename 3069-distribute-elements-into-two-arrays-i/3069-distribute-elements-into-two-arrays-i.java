class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> lst1=new ArrayList<>();
        List<Integer> lst2=new ArrayList<>();
        lst1.add(nums[0]);
        lst2.add(nums[1]);

        for(int i=2;i<n;i++){
            if(lst1.get(lst1.size()-1)>lst2.get(lst2.size()-1)){
                lst1.add(nums[i]);
            }else{
                lst2.add(nums[i]);
            }
        }
        int[] res=new int[n];
        int idx=0;
        for(int m:lst1){
            res[idx++]=m;
        }
        for(int m:lst2){
            res[idx++]=m;
        }
        return res;
    }
}