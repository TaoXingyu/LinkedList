import java.util.Scanner;
public class birth {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner scnr = new Scanner(System.in);
        int birthMonth;
        int birthYear;
        birthMonth = scnr.nextInt();
        birthYear = scnr.nextInt();
        
        System.out.println(birthMonth+ "/" + birthYear);
        
	}

}
