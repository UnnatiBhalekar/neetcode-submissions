class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for( String str: strs){
            char[] sorted_word = str.toCharArray();
            Arrays.sort(sorted_word);
            String key = new String(sorted_word);

            if(map.containsKey(key)){
               map.get(key).add(str);
            }
            else{
               List<String> newList = new ArrayList<>();
               newList.add(str);
               map.put(key, newList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
