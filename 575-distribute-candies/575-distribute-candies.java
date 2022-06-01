class Solution 
{
    public int distributeCandies(int[] candyType) 
    {
        int candyLimit = candyType.length / 2;
        HashSet<Integer> types = new HashSet<>();
        for(int c : candyType)
            types.add(c);
        
        return (candyLimit < types.size()) ? candyLimit : types.size();
    }
}