class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],maxprof=0,i,currentprof;
        for(i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            currentprof=prices[i]-min;
            if(maxprof<currentprof){
                maxprof=currentprof;
            }
        }
   return maxprof;
    }
}