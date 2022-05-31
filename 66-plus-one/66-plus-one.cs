public class Solution 
{
    public int[] PlusOne(int[] digits) 
    {
        int i = digits.Length - 1;
        while(i >= 0 && digits[i] == 9)
        {
            digits[i] = 0;
            i--;
        }
        
        if(i == -1)
        {
            digits = new int[digits.Length + 1];
            digits[0] = 1;
        }
        else
        {
            digits[i]++;
        }
        
        return digits;
    }
}