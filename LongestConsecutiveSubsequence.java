import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
	public int longestConsecutive(int[] nums) {
	    if(nums == null || nums.length == 0) return 0;
	    
	    Set<Integer> set = new HashSet<Integer>();
	    
	    for(int num: nums) set.add(num);
	    int max = 1;
	    for(int num: nums) {
	    	//num hasn't been visited
	        if(set.remove(num)) {
	            int val = num;
	            int sum = 1;
	            while(set.remove(val-1)) val--;
	            sum += num - val;
	            
	            val = num;
	            while(set.remove(val+1)) val++;
	            sum += val - num;
	            
	            max = Math.max(max, sum);
	        }
	    }
	    return max;
	}
}
