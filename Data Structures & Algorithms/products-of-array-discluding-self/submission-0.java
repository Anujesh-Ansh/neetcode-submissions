class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int prefix = 1;

        // product of the prefix
        for(int i=0;i<nums.length;i++){
            res[i] = prefix;
            prefix = prefix * nums[i];
        }

        //now product of the suffix
        int suffix = 1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = res[i] * suffix;
            suffix = suffix * nums[i];
        }

        return res;

    }
}