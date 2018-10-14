// Linked List

package twelth_class;

public class LinkedList {
	public static void main(String[] args) {
		
		java.util.LinkedList<Integer> ll = new java.util.LinkedList<>();
		
		ll.add(12);
		ll.add(11);
		ll.add(15);
		ll.add(123);
		ll.add(12);  // duplicate allowed
		
for (Integer i : ll) {
			
			System.out.println(i);
}
		
		
		
	}

}
