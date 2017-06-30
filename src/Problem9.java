
public class Problem9 {

	public static void main(String[] args) {
		int count=0;
		int a=0;
		int b=0;
		for(int i=1; i<1000; i++){
			for(int j=2; j<1000; j++){
				if(i>=j) continue;
				if(checkEquation(i, j)){
					count ++;
					System.out.println(i+", "+j);
					a=i;
					b=j;
				}
				
			}
		}
		
		int c = 1000-a-b;

		System.out.println(a*b*c);
	}
	
	public static boolean checkEquation(int a, int b){
		
		double value = a+b+Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		if(value==1000) return true;
		
		return false;
	}

}
