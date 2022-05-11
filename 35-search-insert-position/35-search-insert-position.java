class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        // Accounts for the case when the target value is larger than the largest integer within the array.
        if(target > nums[nums.length - 1])
            return nums.length;
        
        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        
        while(low <= high)
        {
            mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] > target)
                high = mid - 1;  
            else
                low = mid + 1;
        }
        
        if(nums[mid] > target)
            return mid;
        else
            return mid + 1;
    }
}