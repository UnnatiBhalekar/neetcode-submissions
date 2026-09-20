class MinStack {

    Stack<Long> stack = new Stack<>();
    long min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty()){
            min = val;
            stack.push((long) val);
        }
        else if(val < min){
            long new_val = 2L * val - min;
            min = val;
            stack.push(new_val);
        }
        else{
            stack.push((long) val);
        }
    }
    
    public void pop() {
        if(stack.empty()){
            return;
        }

        long top = stack.peek();
        stack.pop();
        if(top < min){
            long prev_min = 2L * min - top;
            min = prev_min;
        }
    }
    
    public int top() {
        if(stack.empty()){
            return -1;
        }
        long top = stack.peek();
        if(top < min){
            return (int) min;
        }
        else{
            return (int) top;
        }
    }
    
    public int getMin() {
        if(!stack.empty()){
            return (int) min;
        }
        else{
            return -1;
        }
    }
}
