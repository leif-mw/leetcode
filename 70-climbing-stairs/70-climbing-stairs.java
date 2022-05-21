class Solution 
{
    public int climbStairs(int n) 
    {
        if(n <= 3)
            return n;
        
        int[] positions = new int[n + 1];
        positions[n] = 1;
        positions[n - 1] = 1;
        
        for(int i = n - 2; i >= 0; i--)
        {
            positions[i] = positions[i + 1] + positions[i + 2];
        }
        
        return positions[0];
    }
}