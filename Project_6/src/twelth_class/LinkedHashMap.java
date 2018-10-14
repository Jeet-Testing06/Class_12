// Linked Hash Map

package twelth_class;

import java.util.Set;

public class LinkedHashMap {
public static void main(String[] args) {
		
		java.util.LinkedHashMap<Integer, String> lhm = new java.util.LinkedHashMap<>();
		lhm.put(11, "Jeet");
		lhm.put(2, "Jeet1");
		lhm.put(31, "Jeet2");
		lhm.put(4, "Jeet3");
		lhm.put(4, "Jeet4");  // we can take duplicate key but value will be updated and value can be duplicate.
		

		Set<Integer> all = lhm.keySet();
		
		for (Integer i : all) {
			
			System.out.println(lhm.get(i));
}
		
	}

	
	
}