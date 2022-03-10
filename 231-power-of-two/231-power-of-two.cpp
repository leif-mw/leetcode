class Solution 
{
public:
    bool isPowerOfTwo(int n) 
    {
        // Uses the properties of binary representations of powers of 2 to check whether the given integer is a power of two.
        return n > 0 && !(n & n - 1);
    }
};
