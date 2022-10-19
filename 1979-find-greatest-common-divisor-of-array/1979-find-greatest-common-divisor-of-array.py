class Solution:
    def findGCD(self, nums: List[int]) -> int:
        nums_min = min(nums)
        nums_max = max(nums)
        while nums_max != 0:
            temp = nums_max
            nums_max = nums_min % nums_max
            nums_min = temp
        return nums_min