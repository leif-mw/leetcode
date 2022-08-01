class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majority_freq = len(nums) // 2
        print(majority_freq)
        counts = {}
        for n in nums:
            curr_count = counts.get(n, 0) + 1
            if curr_count > majority_freq:
                return n
            counts[n] = curr_count