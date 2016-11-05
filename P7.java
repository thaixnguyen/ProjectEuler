import java.lang.Math;

class P7{
	public static boolean isPrime (int n){
		int N = (int) Math.sqrt(n);
		for (int i = 2; i <= N; i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
}
	public static int nthPrime(int n){
		int numberofPrimes = 0;
		int prime = 1;
		while (numberofPrimes < n){
			prime++;
			if (isPrime(prime)){
				numberofPrimes++;
			}
		}
		return prime;
}


	public static void main (String [] args){
		System.out.println(nthPrime(10001));
	}
}
