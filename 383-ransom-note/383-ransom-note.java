class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine)     {
        if(ransomNote.length() > magazine.length())
            return false;
        
        int[] alphabet = new int[26];
        for(int i = 0; i < magazine.length(); i++)
        {
            if(i < ransomNote.length())
                alphabet[ransomNote.charAt(i) - 97]--;
                
            alphabet[magazine.charAt(i) - 97]++;
        }
        
        for(int n : alphabet)
        {
            if(n < 0)
                return false; 
        }
        
        return true;
    }
}