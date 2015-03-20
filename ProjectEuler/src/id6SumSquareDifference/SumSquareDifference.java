package id6SumSquareDifference;

public class SumSquareDifference {

	public static void main(String[] args) {
		
		SumSquareDifference ssq = new SumSquareDifference();
		
		long start = System.nanoTime();
		System.out.println(ssq.difference());
		long end = System.nanoTime();		
		System.out.println((end-start)/1000000 + "ms");
	}

//	The sum of the squares of the first ten natural numbers is,
//	12 + 22 + ... + 102 = 385
//	The square of the sum of the first ten natural numbers is,
//	(1 + 2 + ... + 10)2 = 552 = 3025
//
//	Hence the difference between the sum of the squares of the first 
//	ten natural numbers and the square of the sum is 3025 - 385 = 2640.
//	Find the difference between the sum of the squares of the first 
//	one hundred natural numbers and the square of the sum.
	
	
	public int difference(){

		
		// 1 to 100 square each one
		
		// sum of 1 to 100 and then square
		// ( n(n+1)/2 ) ^ 2
		int sumSquareEach = 0;
		for( int i = 1; i <= 100; i++ ){
			sumSquareEach += i*i;
		}
		
		int sumTotalSquare = (100*(100+1))/2;
		sumTotalSquare *= sumTotalSquare;
		
		int difference = sumTotalSquare - sumSquareEach;
		
		return difference;
	}

}
