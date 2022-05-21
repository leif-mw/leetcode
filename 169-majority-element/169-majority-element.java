class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int countTarget = nums.length / 2;
        Random r = new Random();
        
        while(true)
        {
            int randIdx = r.nextInt(nums.length - 0) + 0;
            int randElement = nums[randIdx];
            int count = 0;
            for(int n : nums)
            {
                if(n == randElement)
                    count++;
                if(count > countTarget)
                    return randElement;
            }
            
            if(count > countTarget)
                return randElement;
        }
    }
}