import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	    public List<List<String>> groupAnagrams(String[] strs) {
	        
	    	if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
	        
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        for (String s : strs) {
	            char[] charArray = s.toCharArray();
	            Arrays.sort(charArray);
	            String sortedStr = String.valueOf(charArray);
	            if (!map.containsKey(sortedStr)) map.put(sortedStr, new ArrayList<String>());
	            map.get(sortedStr).add(s);
	        }
	        return new ArrayList<List<String>>(map.values());
	    }
}
