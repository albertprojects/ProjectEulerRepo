package id5SmallestMultiple;

public class SmallestMultiple {

	public static void main(String[] args) {

		SmallestMultiple sm = new SmallestMultiple();
		System.out.println(sm.findSmallestMultiple());
	}
	
//	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

	public int findSmallestMultiple(){
		// brute force way is loop through numbers indefinitely until number is divisible from 1-20
		int multiple = 1;
		while(multiple < Integer.MAX_VALUE){
			
			for(int i = 1; i <= 20; i++){
				if((multiple % i) != 0)
					break;
				if(i == 20){
					return multiple;
				}
			}
			
			multiple++;
			
		}
		
		return -1;
	}
}
