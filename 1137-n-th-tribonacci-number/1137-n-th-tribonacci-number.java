class Solution 
{
    public int tribonacci(int n) 
    {
        if(n <= 3)
        {
            if(n == 0)
                return 0;
            else if(n == 1 || n == 2)
                return 1;
            else 
                return 2;
        }
            
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
            
        for(int i = 3; i < n; i++)
        {
            int temp = n1;
            n1 = n1 + n2 + n3;
            n3 = n2;
            n2 = temp;
        }
        
        return n1 + n2 + n3;
    }
}