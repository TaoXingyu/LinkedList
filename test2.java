
public class test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     System.out.println(f2(2,0));
	}
	public static int f2(int n, int result) {
		if (n==0)
			return 0;
		else return f2(n-1, n+result);
	}
	
}
