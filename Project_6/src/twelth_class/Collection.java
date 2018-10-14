//HashSet

package twelth_class;

import java.util.HashSet;

public class Collection {
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(11);
		hs.add(15);
		hs.add(123);
		hs.add(12);  // duplicate not allowed
		
		
		for (Integer i : hs) {
			
			System.out.println(i);
			
		}
			
	}
	
}