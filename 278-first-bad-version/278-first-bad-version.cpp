// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution 
{
public:
    int firstBadVersion(int n) 
    {
        int low = 1;
        int high = n;
        int mid;
        while(low <= high)
        {
            mid = low + (high - low) / 2;
            bool isBad = isBadVersion(mid);
            if(isBad && !isBadVersion(mid - 1))
                return mid;
            if(isBad)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return -1;
    }
};