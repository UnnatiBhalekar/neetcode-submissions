class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num: nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        for(int num: set){
            if(!set.contains(num - 1)){
                int currentLength = 1;
                while(set.contains(num + currentLength)){
                    currentLength++;
                }
                longest = Math.max(longest, currentLength);
            }
        }
        return longest;
        
    }
}
