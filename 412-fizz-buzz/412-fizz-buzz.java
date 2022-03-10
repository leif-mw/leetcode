class Solution 
{
    public List<String> fizzBuzz(int n) 
    {
        // Creates an ArrayList to store the answer.
        List<String> answer = new ArrayList<>();
        
        for(int i = 1; i < n + 1; i++)
        {
            // Creates a string to store the output.
            String str = "";
            
            if(i % 3 == 0)
                str += "Fizz";
            
            if(i % 5 == 0)
                str += "Buzz";
            
            if(str.equals(""))
                str += i;
            
            answer.add(str);
        }
        
        return answer;
    }
}