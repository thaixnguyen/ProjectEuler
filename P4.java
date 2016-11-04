//Will make an alternative solution eventually with modulo for cleverness (^:

class P4{
	public static boolean Palindrome(int n){
		String number = Integer.toString(n);
		int a = number.length();
		for (int i = 0; i < (a/2); ++i){
			if (number.charAt(i) != number.charAt(a - i - 1)){
				return false;
			}
		}
		return true;
	}

	public static int ProjectEuler4(){
    	int prod = 0;
    	int largest = 0;
    	for (int i = 100 ; i < 1000; i++){
        	for (int j = 100;j < 1000; j++){
            	prod = i*j;
            	if (Palindrome(prod)){
                	if (prod>largest){
                    	largest = prod;
                }
            }
        }
    }
    return(largest);
}
	

	public static void main(String [] arg){
		System.out.print(ProjectEuler4());
	}
}
