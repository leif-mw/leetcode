class MinStack 
{
    private StackNode head; 
    private int min;
    
    public MinStack() 
    {
        head = null;
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) 
    {
        if(val < min)
            min = val;
        
        if(head == null)
        {
            head = new StackNode(val);
            return;
        }
        else
        {
            StackNode s = new StackNode(val);
            s.next = head;
            head = s;
        }
    }
    
    public void pop() 
    {
        if(head.val == min)
        {
            if(head.next == null)
                min = Integer.MAX_VALUE;
            
            int currMin = Integer.MAX_VALUE;
            StackNode currNode = head.next;
            while(currNode != null)
            {
                if(currNode.val < currMin)
                    currMin = currNode.val;
                currNode = currNode.next;
            }
            min = currMin;
        }
        
        head = head.next;
    }
    
    public int top() 
    {
        return head.val;
    }
    
    public int getMin() 
    {
        return min;
    }
    
    private class StackNode
    {
        StackNode next;
        int val;
        
        public StackNode()
        {
            next = null;
            val = 0;
        }
        
        public StackNode(int v)
        {
            next = null;
            val = v;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */