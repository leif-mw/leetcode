class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        k %= nums.length;
        
        int beg = 0;
        int end = nums.length - 1;
        while(beg <= end)
        {
            int temp = nums[beg];
            nums[beg] = nums[end];
            nums[end] = temp;
            beg++;
            end--;
        }
        
        beg = 0;
        end = k - 1;
        while(beg <= end)
        {
            int temp = nums[beg];
            nums[beg] = nums[end];
            nums[end] = temp;
            beg++;
            end--;
        }
        
        beg = k;
        end = nums.length - 1;
        while(beg <= end)
        {
            int temp = nums[beg];
            nums[beg] = nums[end];
            nums[end] = temp;
            beg++;
            end--;
        }
    }
}