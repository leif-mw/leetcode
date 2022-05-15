class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        // Iterates through the string with a sliding window and checks for repeating characters using a HashSet
        HashSet<Character> usedChars = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        
        while(right < s.length())
        {   
            if(!usedChars.add(s.charAt(right)))
            {
                if(usedChars.size() > maxLength)
                    maxLength = usedChars.size();
                
                while(s.charAt(left) != s.charAt(right))
                {
                    usedChars.remove(s.charAt(left));
                    left++;
                }
                
                usedChars.remove(s.charAt(left));
                left++;
            }
            
            else
                right++;
        }
        
        // Accounts for the case when there are no repeating characters in s
        if(usedChars.size() > maxLength)
            return usedChars.size();
        
        return maxLength;
    }
}