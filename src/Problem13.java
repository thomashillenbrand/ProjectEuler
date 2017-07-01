import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("Problem13Numbers.txt"));
		double value = 0;
		while(fileScanner.hasNextLine()){
			value += Double.parseDouble(fileScanner.nextLine());
		}
		System.out.printf("%f\n", value);
	}

}
