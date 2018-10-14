// Array List

package twelth_class;

public class ArrayList {
	
	public static void main(String[] args) {
		
		java.util.ArrayList<Integer> al = new java.util.ArrayList<>();
		
		al.add(12);
		al.add(11);
		al.add(15);
		al.add(123);
		al.add(12);  // duplicate allowed
		
for (Integer i : al) {
			
			System.out.println(i);
		
		
		
	}
	
	
	

}
}