class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        Map<Character, Character> st = new HashMap<>();
        Map<Character, Character> ts = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            Character sCurr = s.charAt(i);
            Character tCurr = t.charAt(i);
            
            if(st.get(sCurr) == null && ts.get(tCurr) == null)
            {
                st.put(sCurr, tCurr);
                ts.put(tCurr, sCurr);
            }
            else if(st.get(sCurr) != tCurr || ts.get(tCurr) != sCurr)
                return false;
        }
        
        return true;
    }
}