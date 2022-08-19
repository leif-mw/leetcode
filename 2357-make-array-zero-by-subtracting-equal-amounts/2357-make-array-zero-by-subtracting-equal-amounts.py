class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        ops = sub = 0
        nums = set(nums)
        nums.discard(0)
        nums = list(nums)
        heapq.heapify(nums)
        while(nums):
            heapq.heappop(nums)
            ops += 1
        return ops