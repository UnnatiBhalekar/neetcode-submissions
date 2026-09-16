class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        //storing all the numbers with its frequency
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int i = 0; i < bucket.length; i++){
            bucket[i] = new ArrayList<>();
        }
        for(int key: map.keySet()){
            int freq = map.get(key);
            bucket[freq].add(key);
        }

        int count = 0;
        int[] result = new int[k];
        for(int i = bucket.length - 1; i > 0; i--){
                for(Integer num: bucket[i]){
                    if(count != k){
                        result[count++] = num;
                    }
                }
        }
        return result;
    }
}
