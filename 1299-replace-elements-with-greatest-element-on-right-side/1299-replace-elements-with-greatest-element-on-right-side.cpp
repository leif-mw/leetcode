class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int length = arr.size();
        int currMax = arr[length - 1];
        arr[length - 1] = -1;
        for(int i = length - 2; i >= 0; i--) {
            int replacement = currMax;
            if(arr[i] > currMax)
                currMax = arr[i];
            arr[i] = replacement;
        }
        return arr;
    }
};