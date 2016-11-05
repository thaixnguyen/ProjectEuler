import java.lang.Math;
class P12{
	public static int Triangular(int n){
		int sum = 0;
		for (int i = 0; i <= n; i++){
			sum += i;
		}
		return sum;
	}

	public static int Divisors(){
		int counter = 0;
		int n = 0;
		int j = 0;
		while (counter <= 500){
			counter = 0;
			j += 1;
			n = Triangular(j);
			for (int i = 1; i <= Math.sqrt(n); i++)
				if (n % i == 0){
					counter += 1;
				}
				
			counter *= 2;
		}
		return n;
}

	public static void main (String[] args){
		System.out.println(Divisors());
	}
}
