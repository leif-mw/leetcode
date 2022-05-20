class Solution 
{
public:
    bool isPalindrome(string s) 
    {
        stack<char> stack;
        for(char& c : s)
        {
            // Converts uppercase to lowercase
            if(c >= 65 && c <= 90)
                c += 32;
            
            // Pushes any lowercase letters and numbers to the stack
            if((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) 
                stack.push(c);
        }
        
        // Checks if s is equal to its reverse (in the stack)
        for(char& c : s)
        {
            if((c >= 97 && c <= 122) || (c >= 48 && c <= 57))
            {
                if(!stack.empty() && stack.top() == c)
                    stack.pop();
                else
                    return false;
            }
        }
        
        return true;
    }
};