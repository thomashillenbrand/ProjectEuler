
public class Problem7 {

	public static void main(String[] args) {
//		int count  =0;
//		while(count < 2){
//			for(int i=0; i<10; i++){
//				if(i==4) break;
//				System.out.println(i);
//			}
//			System.out.println("Hello");
//			
//		}
		
		int count =0;
		int divisor=1;
		double value =1;
		boolean isPrime = true;
		while(count < 10001){
			value++;
			isPrime=true;
			for(int i=2; i<value; i++){
				//System.out.println(value);
				if(value%i==0) {
					isPrime=false;
					System.out.println(isPrime);
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(value);
				count++;		
			}
		}
		System.out.println(value);

	}

}