class Solution 
{
public:
    int searchInsert(vector<int>& nums, int target) 
    {
        int n = nums.size();
        if(target < nums[0])
            return 0;
        else if(target > nums[n - 1])
            return n;
            
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
            {
                if(nums[mid - 1] < target)
                    return mid;
                high = mid - 1;
            }
            else
            {
                if(nums[mid + 1] > target)
                    return mid + 1;
                low = mid + 1;
            }
        }
        
        return -1;
    }
};