class Solution 
{
    public int romanToInt(String s) 
    {
        // Creates a HashMap mapping from the roman numeral characters in the string to their corresponding integer values.
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        // Creates a variable to store the value of the string (intializes to the value of the rightmost numeral to avoid an out of range index when iterating).
        int val = map.get(s.charAt(s.length() - 1)); 
        
        for(int i = s.length() - 2; i >= 0; i--)
        {
            // If the current numeral's value is less than that of the numeral to its right, subtracts that numeral's value from the variable holding the value of the string. Else, adds the value of the current numeral to the variable holding the value of the string.
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
                val -= map.get(s.charAt(i));
                
            else
                val += map.get(s.charAt(i));
        }
        
        return val;
    }
}