class Solution 
{
    public boolean isPalindrome(String s) 
    {
        if(s.length() < 2)
            return true;
        
        // Uses regex to filter out all non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]+", "");
        
        // Uses two pointers to check if the string is a palindrome
        int left = 0;
        int right = s.length() - 1;
        while(left <= right)
        {   
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            
            left++;
            right--;
        }
        
        return true;
    }
}