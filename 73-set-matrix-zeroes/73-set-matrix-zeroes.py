class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # Identifying the rows and columns of zeroes
        rows = set()
        columns = set()
        for i, _ in enumerate(matrix):
            for j, elem in enumerate(matrix[i]):
                if elem == 0:
                    rows.add(i)
                    columns.add(j)

        # Setting the rows and columns to zeroes
        for r in rows:
            matrix[r] = [0 for elem in matrix[r]]
        for c in columns:
            for elem in matrix:
                elem[c] = 0