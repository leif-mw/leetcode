class Solution 
{
public:
    string reverseWords(string s) 
    {   
        // Traverses the string, reversing each word except for the last one
        int currBeg = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s[i] == ' ')
            {
                int beg = currBeg;
                int end = i - 1;
 
                while(beg <= end)
                {
                    char temp = s[beg];
                    s[beg] = s[end];
                    s[end] = temp;
                    beg++;
                    end--;
                }
                
                currBeg = ++i;
            }
        }
        
        // Reverses the last word in the string
        int beg = currBeg;
        int end = s.length() - 1;
 
        while(beg <= end)
        {
            char temp = s[beg];
            s[beg] = s[end];
            s[end] = temp;
            beg++;
            end--;
        }
        
        return s;
    }
};