//Not really proud of this solution, but it works in this case.
class P6{
	public static void main(String[] args){
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++){
			sum1 += i*i;
		}
		for (int j = 1; j <= 100; j++){
			sum2 += j;
		}
		System.out.println((sum2*sum2)-sum1);
	}
}
