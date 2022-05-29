class Solution 
{
    public int[] sumZero(int n) 
    {
        int[] res = new int[n];
        
        if(n % 2 == 0)
        {
            int idx = 0;
            int val = 1;
            while(idx < n)
            {
                if(idx % 2 == 0)
                {
                    res[idx++] = val;
                }
                else
                {
                    res[idx++] = 0 - val;
                    val++;
                }
            }
        }
        
        else
        {
            res[0] = 0;
            int idx = 1;
            int val = 1;
            while(idx < n)
            {
                if(idx % 2 != 0)
                {
                    res[idx++] = val;
                }
                else
                {
                    res[idx++] = 0 - val;
                    val++;
                }
            }
        }
        
        return res;
    }
}