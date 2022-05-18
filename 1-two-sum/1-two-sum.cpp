class Solution 
{
public:
    vector<int> twoSum(vector<int>& nums, int target) 
    {
        vector<int> res;
        unordered_map<int, int> m;
        for(int i = 0; i < nums.size(); i++)
        {
            int complement = target - nums[i];
            if(m.find(complement) != m.end())
            {
                res.push_back(i);
                res.push_back(m[complement]);
                return res;
            }
            
            m[nums[i]] = i;
        }
        
        return res;
    }
};