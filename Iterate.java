import java.util.ArrayList;

public class Iterate {

	public void iterate_arraylist(ArrayList a) {
		int len = a.size();
		//for-loop
		
		for(int i =0;i < len;i++) {
			System.out.println(a.get(i));
		}
		
		//while-loop
		int i = 0;
		while(i < len) {
			System.out.println(a.get(i));
		}
		
		//advance-for-loop
		for(Object j : a) {
			System.out.println(j);
			
		}
	}
}
