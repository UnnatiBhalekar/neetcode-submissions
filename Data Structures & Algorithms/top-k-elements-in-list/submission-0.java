class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //counting freq of each elements
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        //creating buckets
        int n = nums.length;
        List<Integer>[] buckets = new List[n + 1];

        for(int i = 0; i <= n; i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        //collect top k frequent elements
        int[] result = new int[k];
        int idx = 0;

        for(int freq = n; freq >= 1 && idx < k; freq--){
            for(int num: buckets[freq]){
                result[idx++] = num;
                if(idx == k){
                    break;
                }
            }
        }
        return result;

    }
}
