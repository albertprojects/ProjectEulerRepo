package id5SmallestMultiple;

import java.util.concurrent.TimeUnit;

public class SmallestMultiple {

	public static void main(String[] args) {

		SmallestMultiple sm = new SmallestMultiple();
				
		long start = System.nanoTime();
		System.out.println(sm.findSmallestMultiple());
		long end = System.nanoTime();		
		System.out.println((end-start)/1000000 + "ms");
		
	}
	
//	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

	public int findSmallestMultiple(){
		// brute force way is loop through numbers indefinitely until number is divisible from 1-20
		int multiple = 20;
		while(multiple < Integer.MAX_VALUE){
			
			for(int i = 1; i <= 20; i++){
				if((multiple % i) != 0)
					break;
				if(i == 20){
					return multiple;
				}
			}
			multiple += 20;
		}
		return -1;
	}
	
}