package largestPrimeNumber;

import java.util.Arrays;

public class LargestPrimeFactor {
	
	public static void main(String[] args){

		
//		The prime factors of 13195 are 5, 7, 13 and 29.
//		What is the largest prime factor of the number 600851475143 ?
		
		long input = 600851475143L;
		//double input = 105.0d;
		LargestPrimeFactor lpf = new LargestPrimeFactor();
		System.out.println(lpf.getLargestPrime(input));
		
	}
	//Recap:
	// In terms of largest we don't need to worry about finding all the primes, as a result we do not need to do
	// the Sieve of Eratosthenes which was my initial thought. I had trouble figuring out how to store all 600851475143 
	// elements which is a ridiculous amount of space.
	
	// Instead, we can just start from 2 and increment up starting by finding the largest factor of 600851475143 first.
	// Subsequently, I can then factor that value down by keeping track of the largest factor for each iteration, hence we start from 2 every time.
	// This gives us the largest prime factor when "currentDivisor" is equal to or greater than n, indicating nothing is n's multiple
	public double getLargestPrime(long input){
		long n = input;
		long currentDivisor = 2;
		long largestDivisor = 0;
		
		// loop continuously until the divisor is greater than the n
		// if current divisor is divisible by n, change n to the result of divisor
		// Set divisor back to 2
		// go until n is equal to current divisor
		
		while(currentDivisor <= n){
			
			if( (n%currentDivisor) == 0){
				n = n/currentDivisor;
				largestDivisor = currentDivisor;
				currentDivisor = 2;
			}
			else{
				currentDivisor++;
			}
			
		}
		
		return largestDivisor;
	}
}
