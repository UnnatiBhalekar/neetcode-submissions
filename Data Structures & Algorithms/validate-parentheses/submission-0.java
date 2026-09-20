class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                char top = stack.empty() ? '#' : stack.pop();
                if (map.get(c) != top) {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
