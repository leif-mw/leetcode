class Solution 
{
public:
    int maxProfit(vector<int>& prices) 
    {   
        int profit = 0;
        
        int buyDay = 0;
        int sellDay = 1;
        
        while(sellDay < prices.size())
        {
            if(prices[buyDay] > prices[sellDay])
                buyDay = sellDay;
            
            else if(prices[sellDay] - prices[buyDay] > profit)
                profit = prices[sellDay] - prices[buyDay];
            
            sellDay++;
        }
        
        return profit;
    }
};