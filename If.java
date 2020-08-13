
public class If {

	public static void main(String[] args) {
		try {
		      String s = "5.6";
		      Integer.parseInt(s); // Cause a NumberFormatException

		      int i = 0;
		      int y = 2 / i;
		      System.out.println("Welcome to Java");
		    }
		    catch (Exception ex) {
		       System.out.println(ex);
		    }
	}

}
