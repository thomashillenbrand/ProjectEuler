
public class Problem4 {

	public static void main(String[] args) {
		/**
		 * A palindromic number reads the same both ways. The largest palindrome made from the product 
		 *   of two 2-digit numbers is 9009 = 91 × 99.
		 *   
		 * Find the largest palindrome made from the product of two 3-digit numbers.
		 */
		int max = 0;
		for(int i=999; i>100; i--){
			for(int j=999; j>100; j--){
				if(isPalindrome(Integer.toString(i*j)) && i*j>max){
					System.out.println("---------------  "+j+"*"+i+"  --------------");
					System.out.println(i*j);
					max=i*j;
				}

			}
		}
		System.out.println("MAX: "+max);
	}

	
	public static boolean isPalindrome(String number){
		String temp = "";
		for(int i=number.length()-1; i>-1; i--){
			temp += number.charAt(i);
		}
		
		if(temp.equals(number)) return true;
		
		return false;
		
		
	}

}
