class Solution:
    def countElements(self, nums: List[int]) -> int:
        res = len(nums) - 2
        nums.sort()
        lowest = nums[0]
        for n in nums[1:]:
            if n != lowest:
                break
            res -= 1
        highest = nums[-1]
        for n in reversed(nums[:-1]):
            if n != highest:
                break
            res -= 1
        return res if res >= 0 else 0 
        