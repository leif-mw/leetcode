class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        // Accounts for the case when s1.length > s2.length
        if(s1.length() > s2.length())
            return false;
        
        // Calculates the sum of the ASCII values in s1
        int s1Sum = 0;
        for(int i = 0; i < s1.length(); i++)
            s1Sum += s1.charAt(i);
        
        // Initializes the sliding window on s2 and calculates its first sum:
        int currSum = 0;
        for(int i = 0; i < s1.length(); i++)
            currSum += s2.charAt(i);
        
        // Checks if the initial substring is a permutation of s1:
        if(currSum == s1Sum)
        {
            int[] alphabet = new int[26];
            boolean isPermutation = true;
            
            for(int i = 0; i < s1.length(); i++)
            {
                alphabet[s1.charAt(i) - 97]++;
                alphabet[s2.charAt(i) - 97]--;
            }
            
            for(int count : alphabet)
                if(count != 0)
                    isPermutation = false;
            
            if(isPermutation)
                return true;
        }
        
        // Traverses the remainder of s2 with the sliding window:
        for(int i = 1; i < s2.length() - (s1.length() - 1); i++)
        {
            currSum -= s2.charAt(i - 1);
            currSum += s2.charAt(i + s1.length() - 1);
            
            // Checks if the current substring is a permutation of s1:
            if(currSum == s1Sum)
            {
                int[] alphabet = new int[26];
                boolean isPermutation = true;
            
                for(int j = 0; j < s1.length(); j++)
                {
                    alphabet[s1.charAt(j) - 97]++;
                    alphabet[s2.charAt(i + j) - 97]--;
                }
            
                for(int count : alphabet)
                    if(count != 0)
                        isPermutation = false;
            
                if(isPermutation)
                    return true;
            }
        }
        
        return false;
    }
}
