"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        if not root:
            return []
        res = []
        queue = deque([root])
        while queue:
            level_size = len(queue)
            level_res = []
            while(level_size):
                curr = queue.popleft()
                level_res.append(curr.val)
                for child in curr.children:
                    if child:
                        queue.append(child)
                level_size -= 1
            res.append(level_res)
        return res