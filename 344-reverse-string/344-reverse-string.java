class Solution 
{
    public void reverseString(char[] s) 
    {
        int beg = 0;
        int end = s.length - 1;
 
        while(beg <= end)
        {
            char temp = s[beg];
            s[beg] = s[end];
            s[end] = temp;
            beg++;
            end--;
        }
    }
}