class Solution 
{
public:
    bool isAnagram(string s, string t) 
    {
        if(s.length() != t.length())
            return false;
        
        int chars[26] = {};
        for(unsigned int i = 0; i < s.length(); i++)
        {
            chars[s[i] - 97]++;
            chars[t[i] - 97]--;
        }
        
        for(int& c : chars)
            if(c != 0)
                return false;
        return true;
    }
};