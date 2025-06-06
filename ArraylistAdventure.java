package app;
import java.util.ArrayList;
public class ArraylistAdventure {
	public static void main(String [] args) {
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("bheem");
		a1.add("Ben10");
		a1.add("chutky");
		a1.add("sunny");
		System.out.println(a1);
	    System.out.println(a1.remove(0));
	    System.out.println(a1);
	    System.out.println(a1.removeLast());
	    a1.set(2,"Mohan");
	    System.out.println(a1);
	    
		
	}

}
 