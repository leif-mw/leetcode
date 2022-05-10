/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
        // Accounts for the case when bad = 1
        if(isBadVersion(1))
            return 1;
        
        int low = 2;
        int high = n;
        
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            boolean isMidBad = isBadVersion(mid);
            
            if(isMidBad && !isBadVersion(mid - 1))
                return mid;
            
            if(isMidBad)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return -1;
    }
}