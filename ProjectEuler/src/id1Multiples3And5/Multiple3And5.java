package id1Multiples3And5;

public class Multiple3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple3And5 m = new Multiple3And5();
		System.out.println(m.sumOfMultiples(3, 5));
	}
	
	
//	if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//	Find the sum of all the multiples of 3 or 5 below 1000.

	// Find all multiples of 3 and 5 between 0-999
	
	// Cases are divis by 3 or 5 need to check for overlap... subtract by 1000/15 to take into account the redundant   
	
	// Pseudo code
	
	// Loop 0 - 100 check if each value is divisible by 3 or 5
	
	public int sumOfMultiples(int a, int b){
	
		int sum = 0;
		int numOfa = 999/a;
		int numOfb = 999/b;
		
		for(int i = 1; i <= numOfa; i++){
			sum += i*a;
		}
		
		for(int j = 1; j <= numOfb; j++){
			if((j*b) % (a*b) != 0){
				sum += (j*b);
			}
		}
		return sum;		
	}
	
	
}
