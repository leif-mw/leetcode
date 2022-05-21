class MyQueue 
{
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    
    public MyQueue() 
    {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) 
    {
        if(s1.empty()) 
        {
            s1.push(x);
            return;
        }
        
        int count = 0;
        while(!s2.empty()) 
        {
            s1.push(s2.pop());
            count++;
        }
        
        s2.push(x);
        for(int i = 0; i < count; i++) 
        {
            s2.push(s1.pop());
        }
    }
    
    public int pop() 
    {
        int res = s1.pop();
        if(!s2.empty())
            s1.push(s2.pop());
        return res;
    }
    
    public int peek() 
    {
        return s1.peek();
    }
    
    public boolean empty() 
    {
        return s1.empty();
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