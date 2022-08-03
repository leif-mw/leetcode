class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Binary search for correct row 
        low = 0
        high = len(matrix) - 1
        while(low <= high):
            mid = low + (high - low) // 2
            if matrix[mid][0] <= target and matrix[mid][-1] >= target:
                matrix = matrix[mid]
                break
            elif matrix[mid][0] < target:
                low = mid + 1
            else:
                high = mid - 1
        if isinstance(matrix[0], list):
            return False
        
        # Binary search for target
        low = 0
        high = len(matrix) - 1
        while(low <= high):
            mid = low + (high - low) // 2
            if matrix[mid] == target:
                return True
            elif matrix[mid] < target:
                low = mid + 1
            else:
                high = mid - 1
        return False