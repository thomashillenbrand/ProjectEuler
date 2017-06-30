
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0;
		int i = 1;
		int j = 1;
		int newVal=0;
		int sum=0;
		while(newVal <=4000000){
			System.out.println(j);
			newVal = i+j;
			
			if(newVal%2==0) sum+=newVal;
			i=j;
			j=newVal;
		}
		System.out.println(sum);
	}

	
}
