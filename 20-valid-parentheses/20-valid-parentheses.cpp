class Solution 
{
public:
    bool isValid(string s) 
    {
        if(s.length() % 2 != 0)
            return false;
        
        stack<char> stack;
        for(auto &c : s)
        {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if(c == ')')
            {
                if(!stack.empty() && stack.top() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if(c == '}')
            {
                if(!stack.empty() && stack.top() == '{')
                    stack.pop();
                else
                    return false;
            }
            else if(c == ']')
            {
                if(!stack.empty() && stack.top() == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        
        if(stack.empty())
            return true;
        else
            return false;
    }
};