class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_seen = {}
        for i, n in enumerate(nums):
            if target - n in nums_seen:
                return [nums_seen[target - n], i]
            nums_seen[n] = i
        return -1