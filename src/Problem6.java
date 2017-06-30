
public class Problem6 {

	public static void main(String[] args) {

		double value = Math.pow(5050, 2);
		double number = 0;
		for(int i=1;i<101;i++){
			number+=Math.pow(i, 2);
		}
		double difference = Math.abs(value-number);
		
		System.out.println((int)difference);
		
	}

}
