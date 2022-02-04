class Solution 
{
    public int search(int[] nums, int target) 
    {
        // Creates a variable to hold the index of the target number.
        int index = -1;
        
        // Iterates through the array to check for the target number. 
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
                index = i;
        }
        
        // Returns the index of the target number in the array.
        return index;
    }
}