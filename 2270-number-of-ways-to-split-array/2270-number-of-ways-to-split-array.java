class Solution 
{
    public int waysToSplitArray(int[] nums)
    {
        int res = 0;
        int n = nums.length;
        
        long rightSum = 0, leftSum = 0;
        for(int i = 0; i < n; i++)
        {
            rightSum += nums[i];
        }
        for(int i = 0; i < n - 1; i++)
        {
            leftSum += nums[i];
            rightSum -= nums[i];
            if(leftSum >= rightSum)
                res++;
        }
        
        return res;
    }
}