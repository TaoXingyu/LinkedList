
public class ReverseString {
	public static String reverse2(String str) {
	    char[] chars = str.toCharArray();
	    String reverse = "";
	    for (int i = chars.length - 1; i >= 0; i--) {
	      reverse += chars[i];
	    }
	    return reverse;
	  }
}
