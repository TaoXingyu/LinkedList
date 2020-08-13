
public class isPrime {
	public boolean prime(int n){
		if(n < 2){
			return false;
		}
		if(n == 2 || n == 3){
			return true;
		}
		else {
			int a = (int)Math.sqrt(n);
			for(int i = 2; i <= a ; i++){
				if(n % i == 0){
					return false;
				}
			}
			return true;
		}		
	}

}
