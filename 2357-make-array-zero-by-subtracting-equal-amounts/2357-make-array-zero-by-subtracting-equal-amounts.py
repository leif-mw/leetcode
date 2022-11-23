class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        nums_set = set(nums)
        return len(nums_set) - 1 if 0 in nums_set else len(nums_set)