
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * The prime factors of 13195 are 5, 7, 13 and 29.
		 * What is the largest prime factor of the number 600851475143 ?
		 */

		double max = 600851475143.0;
		
		for(int i=1; i<20000; i++){
			if(max%i==0){
				System.out.println(i +" is a factor of "+max);
				max = max/i;
				System.out.println("new max: "+max);
			}
			if(max==i || max ==1) {
				System.out.println(i);
				break;
			}
		}
		
		//System.out.println(i);
		
	}

}
