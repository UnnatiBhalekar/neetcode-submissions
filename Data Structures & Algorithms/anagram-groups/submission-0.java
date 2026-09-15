class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s: strs){
             int[] freq = new int[26];
             for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                freq[c - 'a']++;
             }
             StringBuilder acheivedKey = new StringBuilder();
             for(int i = 0; i < 26; i++){
                acheivedKey.append(freq[i]);
                acheivedKey.append('*');
             }
             String key = acheivedKey.toString();

             if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
             }
             map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
