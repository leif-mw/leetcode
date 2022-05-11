class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int[] numsSquared = new int[nums.length];
        
        int front = 0;
        int back = nums.length - 1;
        int currIdx = back;
        
        while(currIdx >= 0)
        {
            if(Math.abs(nums[front]) > Math.abs(nums[back]))
            {
                numsSquared[currIdx] = nums[front] * nums[front];
                front++;
                currIdx--;
            }
            
            else
            {
                numsSquared[currIdx] = nums[back] * nums[back];
                back--;
                currIdx--;
            }
        }
        
        return numsSquared;
    }
}