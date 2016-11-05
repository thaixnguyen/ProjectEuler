//Just brute forced this one using simple arithmetic and for loops.

public class P9{
	private static final int N = 1000;
	public static int ProjectEuler9(){
		int prod = 0;
		for (int a = 1; a < N; a++){
			for (int b = a + 1; b < N; b++){
				int c = 1000 - a - b;
					if (a*a + b*b == c*c){
						prod = a*b*c;
					}
			}
	}
		return prod;
}

	public static void main (String [] args){
		System.out.println(ProjectEuler9());
	}
}
