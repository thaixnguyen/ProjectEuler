import java.lang.Math;
class P12{
	public static int Triangular(int n){
		int sum = 0;
		for (int i = 0; i <= n; i++){
			sum += i;
		}
		return sum; //returns the sum of n*(n+1)/n which is the definition of a triangular number.
	}

	public static int Divisors(){
		int counter = 0; //set a counter variable.
		int n = 0; //set a variable equal to the triangular number.
		int j = 0; //the variable used for the parameter of Triangular.
		while (counter <= 500){
			counter = 0; //resets the counter.
			j += 1; //adds 1 to j everytime it loops around.
			n = Triangular(j); 
			for (int i = 1; i <= Math.sqrt(n); i++) //Used square root to reduce the amount of divisors checked.
				if (n % i == 0){
					counter += 1; //adds 1 to the counter if it's a divisor of a triangular number.
				}
				
			counter *= 2; //an observation I made was 1 to sqrt(n) is half of its divisors, so multiply by 2 to get the right number of divisors.
		}
		return n; //returns the first triangular number with 500 divisors.
}

	public static void main (String[] args){
		System.out.println(Divisors());
	}
}
