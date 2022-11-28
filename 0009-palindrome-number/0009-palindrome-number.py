class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        digits = []
        while x > 0:
            digits.append(x % 10)
            x //= 10
        start = 0
        end = len(digits) - 1
        while start <= end:
            if digits[start] != digits[end]:
                return False
            start += 1
            end -= 1
        return True