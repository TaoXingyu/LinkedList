
public class Palindrome {

	
		private static boolean Palindrome(String string) {
	        StringBuilder stringBuilder = new StringBuilder(string).reverse();
	        String newString = new String(stringBuilder);
	 
	        if (newString.equals(newString)) {
	            return true;
	        } else {
	            return false;
	        }
	}

}
