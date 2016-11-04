//Really cheap way of doing this by using properties of numbers. 
class P5{
	public static void main(String args[]){
		int primes[] = {2, 3, 5, 7, 11, 13, 17, 19};
		int N = 20;
		int a = 1;
		int b = 1;
		for (int i = 0; i < primes.length; i++){
			b = 1;
			while (b*primes[i] < N)
				b *= primes[i];
			a *= b;
		}
		System.out.println(a);

	}

}
