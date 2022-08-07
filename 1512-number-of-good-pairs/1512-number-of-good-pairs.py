class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        res = 0
        counts = {}
        for n in nums:
            count = counts.get(n, 0)
            res += count
            counts[n] = count + 1
        return res