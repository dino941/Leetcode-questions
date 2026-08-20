class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int c=-nums[i]-nums[j];
                if(set.contains(c)){
                    List<Integer> tri=Arrays.asList(nums[i],nums[j],c);
                    Collections.sort(tri);
                    res.add(tri);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}