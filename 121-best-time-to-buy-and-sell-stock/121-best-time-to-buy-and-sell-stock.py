class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) < 2:
            return 0
        
        res = 0
        buy = 0
        sell = 1
        while sell < len(prices):
            if prices[buy] > prices[sell]:
                buy = sell
            if prices[sell] - prices[buy] > res:
                res = prices[sell] - prices[buy]
            sell += 1
                
        return res