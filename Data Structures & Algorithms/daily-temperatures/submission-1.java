class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int n = temperatures.length;

        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!stack.empty() && stack.peek()[0] < temperatures[i]){
                int[] pair = stack.pop();
                result[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{temperatures[i], i});
            
        }
        return result;
    }
}
