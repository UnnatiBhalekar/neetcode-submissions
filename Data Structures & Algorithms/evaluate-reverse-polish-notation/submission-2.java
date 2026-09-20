class Solution {
    public int evalRPN(String[] tokens) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // it's an operator — pop two operands, compute, push result
                int second = st.pop();
                int first = st.pop();

                if (token.equals("+")) {
                    answer = first + second;
                } else if (token.equals("-")) {
                    answer = first - second;
                } else if (token.equals("*")) {
                    answer = first * second;
                } else {
                    answer = first / second;
                }
                st.push(answer);
            } else {
                // it's a number — parse the whole string into an int, push it
                int new_value = Integer.parseInt(token);
                st.push(new_value);
            }
        }
        return st.pop();
    }
}
