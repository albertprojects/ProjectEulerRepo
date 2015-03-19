package id4LargestPalindromeProduct;

public class LargestPalindromeProduct {

	public static void main(String[] args){
		LargestPalindromeProduct lpp = new LargestPalindromeProduct();
		
		
		long start = System.nanoTime();
		System.out.println(lpp.largestPalindrome());
		long end = System.nanoTime();
		System.out.println(((end-start)/1000000) + "ms");
				
	}
	
	
	public int largestPalindrome(){
		// 999 * 999 = 998,001 upper bound.
		// Start finding Palindromes from 998,001 down
		int in1 = 999;
		int in2 = 999;
		int product = in1 * in2;
		
		for(int i = product; i > 0; i--){
			if(isPalindrome(i)){
				for(int j = in1; j > 99; j--){
					in2 = i/j;
					if ((i % j) == 0 && (in2 > 99 && in2 < 1000)){
						return i;
					}
				}
			}
		}
		
		return -1;
	}
	
	
	public boolean isPalindrome(int product){
		// Takes the most time converting product to string every time.
		String productString = String.valueOf(product);
		int left = 0;
		int right = productString.length()-1;
	
// 1. Implement check with charAt for performance. Clocked in 250ms
		while(left < right){
			if(productString.charAt(left) != productString.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		
// 2. Implement checking with modulo instead of charAt for performance. Clocked in 400ms
//		while(left < right){
//			int leftDigit = (product % (int)Math.pow(10, left + 1)) / (int)Math.pow(10, left);
//			int rightDigit = (product % (int) Math.pow(10, right + 1)) / (int)Math.pow(10, right);
//			if(leftDigit != rightDigit){
//				return false;
//			}
//			left++; 
//			right--;
//		}
		
		
		
		
		
		return true;
	}
	
}
