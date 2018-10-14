//Tree Map

package twelth_class;

import java.util.Set;
import java.util.TreeMap;

public class TreeMAp {

public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(11, "Jeet");
		tm.put(2, "Jeet1");
		tm.put(31, "Jeet2");
		tm.put(4, "Jeet3");
		tm.put(4, "Jeet4");  // we can take duplicate key but value will be updated and value can be duplicate.
		

		Set<Integer> all = tm.keySet();
		
for (Integer i : all) {
			
			System.out.println(tm.get(i));
}
		
	}

	
	
	
	
}
