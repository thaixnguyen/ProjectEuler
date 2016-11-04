class P2{
	static int x = 0;
	static int y = 1;
	static int z = x + y;
	static int even = 0;

	public static int ProjectEuler2(){
		while (z < 4000000){
			x = y;
			y = z;
			z = x + y;
			if (z % 2 == 0){
				even += z;
			}

		}
	return even;
	}

	public static void main(String[] args){
		System.out.print(ProjectEuler2());
	}

}