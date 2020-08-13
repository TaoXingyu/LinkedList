import java.util.regex.Pattern;

public class teste {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		String regex = "[^+-]\\d+\\.?\\d+";
	
		boolean isMatch = Pattern.matches(regex, "+123.45");
		System.out.print(isMatch);

	}

}
