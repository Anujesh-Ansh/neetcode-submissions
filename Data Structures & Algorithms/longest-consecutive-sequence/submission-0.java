class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int n:nums){
            list.add(n);
        }
        int max = 0;
        for(int n:list){
            if(!list.contains(n-1)){
                int count=1;
                while(list.contains(n+count)){
                    count+=1;
                }
                if (max<count){
                    max = count;
                }
            }
        }
        return max;
    }
}