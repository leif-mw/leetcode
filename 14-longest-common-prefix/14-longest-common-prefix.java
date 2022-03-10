class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        // Creates a string to store the longest common prefix.
        String longest = "";
        
        for(int i = 0; i < strs[0].length(); i++)
        {
            // Creates a temporary variable to keep track of the character in the string at position `i`.
            char temp = strs[0].charAt(i);
            
            for(int j = 0; j < strs.length; j++)
            {
                // If a common prefix is no longer shared among all the strings in the array, then returns the string held in `longest` (when there is no common prefix, this will return an empty string).
                if(i > strs[j].length() - 1 || strs[j].charAt(i) != temp)
                    return longest;
            }
            
            // Concatenates the character held in the temporary variable to the string storing the longest common prefix.
            longest += temp;
        }
        
        // Accounts for edge cases (e.g. when the longest common prefix amongst the array of strings is equal to each of the strings).
        return longest;
    }
}