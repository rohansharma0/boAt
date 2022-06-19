class MyStack {
    
    ArrayDeque<Integer> que;
    
    public MyStack() {
        que = new ArrayDeque<>();
    }
    
    public void push(int x) {
        que.offer(x);
    }
    
    public int pop() {
        return que.removeLast();
    }
    
    public int top() {
        return que.getLast();
    }
    
    public boolean empty() {
        return que.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */