class Solution:

    def __init__(self, nums: List[int]):
        self.index_map = {}
        for i, n in enumerate(nums):
            if n in self.index_map:
                self.index_map[n].append(i)
            else:
                self.index_map[n] = [i]

    def pick(self, target: int) -> int:
        return random.choice(self.index_map[target])


# Your Solution object will be instantiated and called as such:
# obj = Solution(nums)
# param_1 = obj.pick(target)