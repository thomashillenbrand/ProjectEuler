
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		double value =3;
		double sum=5;
		boolean isPrime = true;
		while(value < 2000000){
			value+=2;
			System.out.println(value);
			isPrime=true;
			for(int i=3; i<value; i+=2){
				//System.out.println(value);
				if(value%i==0) {
					isPrime=false;
					break;
					//System.out.println(isPrime);
					//sum+=value;
				}
				
			}
			if(isPrime==true) {
				
				count++;
				sum+=value;
				//System.out.println("Count: "+count+"Sum: "+sum);
			}
		}
		System.out.printf("dexp: %f\n", sum);
	}

}
