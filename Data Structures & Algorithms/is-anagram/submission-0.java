class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() != t.length() || s == null || t == null ){
            return false;
        }
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            freq[c - 'a']--;
        }
        for(int num: freq){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
