class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int delimeter_pos = str.indexOf('#', i);
            String len = str.substring(i, delimeter_pos);
            int length = Integer.parseInt(len);
            result.add(str.substring(delimeter_pos + 1,  (delimeter_pos + 1) + length));
            i = (delimeter_pos + 1) + length;

        }
        return result;
    }
}
