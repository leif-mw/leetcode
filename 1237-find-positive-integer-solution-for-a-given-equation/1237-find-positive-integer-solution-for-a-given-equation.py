"""
   This is the custom function interface.
   You should not implement it, or speculate about its implementation
   class CustomFunction:
       # Returns f(x, y) for any given positive integers x and y.
       # Note that f(x, y) is increasing with respect to both x and y.
       # i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
       def f(self, x, y):
  
"""

class Solution:
    def findSolution(self, customfunction: 'CustomFunction', z: int) -> List[List[int]]:
        res = []
        lower_bound = 1
        upper_bound = 1000
        for x in range(lower_bound, upper_bound + 1):
            low = lower_bound
            high = upper_bound
            while low <= high:
                y = low + (high - low) // 2
                function_z = customfunction.f(x, y)
                if function_z == z:
                    res.append([x, y])
                    break
                elif function_z < z:
                    low = y + 1
                else:
                    high = y - 1
        return res