
public class Problem14 {

	public static void main(String[] args) {
		/**
		 * The following iterative sequence is defined for the set of positive integers:
		 *	
		 *	n → n/2 (n is even)
		 *	n → 3n + 1 (n is odd)
		 *	
		 *	Using the rule above and starting with 13, we generate the following sequence:
		 *	
		 *	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
		 *	It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
		 *	
		 *	Which starting number, under one million, produces the longest chain?
		 *	
		 *	NOTE: Once the chain starts the terms are allowed to go above one million.
		 */
		int maxCount=0;
		double num=0;
		
//	System.out.println(collatzSequence(837799));
		
//		System.out.println(collatzSequence(13));
		
		for(double i=1; i<1000000; i++){
			int count = collatzSequence(i);
			if(count > maxCount){
				maxCount = count;
				num=i;
			}
		}
		
		System.out.println(maxCount+", "+num);
		

	}
	
	public static int collatzSequence(double n){
		int count=1;
		//System.out.println(count+": "+ n);
		
		while(n > 1){
			if(n%2==0){
				n /= 2;
				count++;
				//System.out.println(count+": "+ n);
			}
			else{
				n = 3*n+1;
				count++;
				//System.out.println(count+": "+ n);
			}
		}
		
		return count;
	}

}
