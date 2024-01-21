class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min=prices[0],maxprof=0,currentprof;
        for(int i=1;i<prices.size();i++){
                if(prices[i]<min){
                    min=prices[i];
                }
                currentprof=prices[i]-min;
                if(maxprof<currentprof){
                    maxprof=currentprof;
                }
        }
     return maxprof;   
    }
};