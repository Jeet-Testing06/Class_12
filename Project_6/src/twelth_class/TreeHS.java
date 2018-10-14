// Tree Set

package twelth_class;

import java.util.TreeSet;

public class TreeHS {
	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(12);
		ts.add(11);
		ts.add(15);
		ts.add(123);
		ts.add(12);  // duplicate not allowed
		
for (Integer i : ts) {
			
			System.out.println(i);
		
}
		
	}

}
