class P1{
	static int sum = 0;
	public static int ProjectEuler1(){
		for (int i = 0; i < 1000; i += 3){
			sum += i;
		}
		for (int i = 0; i < 1000; i += 5){
			if (i % 3 != 0){
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.print(ProjectEuler1());
	}

}