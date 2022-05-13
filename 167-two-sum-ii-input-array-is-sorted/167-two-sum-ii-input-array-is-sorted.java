class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int currSum = numbers[index1] + numbers[index2]; 
            
        while(currSum != target)
        {
            currSum = numbers[index1] + numbers[index2];
            
            if(currSum < target)
                index1++;
            
            if(currSum > target)
                index2--;
        }
        
        return new int[] {index1 + 1, index2 + 1};
    }
}