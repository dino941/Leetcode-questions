class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int c= target - nums[i];
            if (num.containsKey(c)) {
                return new int[]{num.get(c), i};
            }
            num.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}