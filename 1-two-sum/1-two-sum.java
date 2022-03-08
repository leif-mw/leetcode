class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Creates a HashMap mapping from the numbers in the array to their indices.
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            // Ensures that index values in the hashmap are not overwritten.
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
            
            Integer val = map.get(target - nums[i]);
            
            // If there is a key equal to the difference of the target value and the current number (and with a different index than that of the current number), then returns the solution.
            if(val != null && val != i)
                return new int[] {val, i};
        }
        
        // Returns null if there is no solution.
        return null;
    }
}