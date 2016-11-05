import java.lang.Math;
class P10{
	public static boolean isPrime (int n){
		int N = (int) Math.sqrt(n);
		for (int i = 2; i <= N; i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main (String [] args){
		long sum = 2;
		for (int i = 3; i < 2000000; i += 2){
			if (isPrime(i))
				sum += i;
			
		}
		System.out.println(sum);
	}
}
