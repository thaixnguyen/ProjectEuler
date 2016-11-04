class P3{
	public static void main(String args[]){
		long n = 600851475143l;
		for (long i = 2; i <= n; i++){
			if (n % i == 0){
				System.out.println(i);
				n = n/i;
			}
		}
	}

}