class Solution 
{
    public int fib(int n) 
    {
        if(n <= 4)
        {
            if(n <= 1)
                return n;
                
            return n - 1;
        }
        
        int[] seq = new int[n + 1];
        seq[0] = 0;
        seq[1] = 1;
        
        int i = 2;
        while(i < n)
        {
            seq[i] = seq[i - 1] + seq[i - 2]; 
            i++;
        }
        
        return seq[i - 1] + seq[i - 2];
    }
}