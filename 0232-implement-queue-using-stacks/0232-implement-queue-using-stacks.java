class MyQueue {
    Stack<Integer> a;
    public MyQueue() {
        a= new Stack<Integer>();
    }
    
    public void push(int x) {
        a.add(x);
    }
    
    public int pop() {
        return a.remove(0);
    }
    
    public int peek() {
        return a.get(0);
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */