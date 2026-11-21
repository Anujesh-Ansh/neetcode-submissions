class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> res = new HashMap<>(nums.length);
        int c=0;
        for(int n:nums){
            int needs = target - n;
            if(res.containsKey(needs)){
                return new int[]{res.get(needs),c};
            }
            res.put(n,c);
            c++;
        }
        return new int[0];
    }
}