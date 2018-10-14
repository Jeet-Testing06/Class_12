// Linked Hash Set

package twelth_class;

import java.util.LinkedHashSet;

public class LinkedHS {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(12);
		lhs.add(11);
		lhs.add(15);
		lhs.add(123);
		lhs.add(12);  // duplicate not allowed
		
for (Integer i : lhs) {
			
			System.out.println(i);
			
		}
		
		
		
	}
	

}
