class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> res;
        int sum = 0;
        for(int n : nums) {
            res.push_back(sum += n);
        }
        return res;
    }
};