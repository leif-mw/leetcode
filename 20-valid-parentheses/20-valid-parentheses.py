class Solution:
    def isValid(self, s: str) -> bool:
        pairs = {
            '(': ')',
            '{': '}',
            '[': ']',
        }
        stack = deque()
        for c in s:
            if c in pairs.keys():
                stack.append(c)
            else:
                if not stack or pairs[stack.pop()] != c:
                    return False
        return not stack