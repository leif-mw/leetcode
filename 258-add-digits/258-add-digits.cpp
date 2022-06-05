class Solution 
{
public:
    int addDigits(int num) 
    {
        if(num == 0)
            return 0; 
        unsigned int res = num %= 9;
        if(res == 0)
            return 9;
        return res;
    }
};