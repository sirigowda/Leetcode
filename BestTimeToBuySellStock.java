
public class BestTimeToBuySellStock {
	
	  public int maxProfit(int[] prices) {
	        if(prices.length==0) return 0;
	        int max=0;
	        int min=prices[0];
	        for (int n : prices){
	            min=Math.min(n,min);
	            max=Math.max(max,n-min);
	        }
	        return max;
	    }
}
