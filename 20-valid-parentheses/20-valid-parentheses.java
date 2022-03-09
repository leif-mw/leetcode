class Solution 
{
    public boolean isValid(String s) 
    {
        // Creates a Stack to keep track of currently open brackets.
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)
        {       
            // If the bracket is an opening bracket, then pushes it to the Stack.
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            
            // If the bracket is a closing bracket, checks if the closing bracket is of the same type as the opening bracket at the top of the Stack.
            else if(!stack.empty() && Math.abs(s.charAt(i) - stack.peek()) < 3)
                stack.pop();
            
            // Else, returns false.
            else
                return false;
        }
        
        // If the stack is empty after the iteration is finished, returns true. Otherwise, returns false.
        return stack.empty();
    }
}