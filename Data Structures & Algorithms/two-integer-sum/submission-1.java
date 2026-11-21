class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> res = new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            int needs = target - nums[i];
            if(res.containsKey(needs)){
                return new int[]{res.get(needs),i};
            }
            res.put(nums[i],i);
        }
        return new int[0];
    }
}