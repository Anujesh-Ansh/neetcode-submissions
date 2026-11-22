class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k>nums.length){
            return new int[0];
        }
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int num:nums){
            frequency.put(num,frequency.getOrDefault(num,0) +1);
        }

        List <Integer>[] bins = new List[nums.length+1];

        for(int c:frequency.keySet()){
            int f = frequency.get(c);
            if(bins[f]==null){
                bins[f] = new ArrayList<>();
            }
            bins[f].add(c);
        }
        int[] result = new int[k];
        int count = 0;
        for(int i=bins.length-1;i>=0 && count<k;i--){
            if(bins[i] == null){
                continue;
            }
            for(int value:bins[i]){
                if(count == k){
                    return result;
                }
                result[count] =value;
                count++;
            }
        }
        return result;
    }
}