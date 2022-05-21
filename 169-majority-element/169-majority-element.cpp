class Solution 
{
public:
    int majorityElement(vector<int>& nums) 
    {   
        unordered_map<int, int> m;
        int threshold = nums.size() / 2; 
        for(int& n : nums)
        {
            if(m.count(n) == 0)
                m[n] = 1;
            else
            {
                int temp = m[n];
                temp++;
                
                if(temp > threshold)
                    return n;
                
                m[n] = temp;
            }
        }
        
        // Accounts for edge cases
        for(auto& pair : m) 
        {
            if(pair.second > threshold)
                return pair.first;
        } 
        
        return 0;
    }
};