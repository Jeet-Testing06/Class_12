// Hash Map

package twelth_class;

import java.util.HashMap;
import java.util.Set;

public class HAshMap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(11, "Jeet");
		hm.put(2, "Jeet1");
		hm.put(31, "Jeet1");
		hm.put(4, "Jeet3");
		hm.put(4, "Jeet4");  // we can take duplicate key but value will be updated and value can be duplicate.
		

		Set<Integer> all = hm.keySet();
		
for (Integer i : all) {
			
			System.out.println(hm.get(i));
}
		
	}

}
