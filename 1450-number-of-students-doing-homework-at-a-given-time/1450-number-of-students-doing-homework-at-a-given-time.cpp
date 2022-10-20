class Solution {
public:
    int busyStudent(vector<int>& startTime, vector<int>& endTime, int queryTime) {
        int res = 0;
        int numStudents = startTime.size();
        for(int i = 0; i < numStudents; i++) {
            if(startTime[i] <= queryTime && endTime[i] >= queryTime)
                res++;
        }
        return res;
    }
};