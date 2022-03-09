class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        // Uses the properties of binary representations of powers of two to check whether the given integer is a power of two.
        return (n & (n - 1)) == 0 && n > 0; 
    }
}
