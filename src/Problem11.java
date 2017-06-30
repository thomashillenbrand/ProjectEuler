import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) throws FileNotFoundException {

		double[][] numGrid = loadGrid(new File("Problem11NumGrid.txt"));

		double max=0;
		double value=0;

		for(int currentRow=0;currentRow<20;currentRow++){
			for(int currentCol=0;currentCol<20;currentCol++){
				value=checkAcross(numGrid, currentRow, currentCol);
				if(value > max) max = value;

				value=checkVertical(numGrid, currentRow, currentCol);
				if(value > max) max = value;

				value=checkRightDiagUp(numGrid, currentRow, currentCol);
				if(value > max) max = value;
				
				value=checkRightDiagDown(numGrid, currentRow, currentCol);
				if(value > max) max = value;

				value=checkLeftDiagUp(numGrid, currentRow, currentCol);
				if(value > max) max = value;
				
				value=checkLeftDiagDown(numGrid, currentRow, currentCol);
				if(value > max) max = value;
				
				System.out.printf("------------- MAX: %f\n ", max);


			}
		}

		System.out.printf("dexp: %f\n", max);

	}

	public static double checkAcross(double[][] numGrid, int currentRow, int currentCol){
		double value = 0;
		if(currentCol>16) return value;

		double x1 = numGrid[currentRow][currentCol];
		double x2 = numGrid[currentRow][currentCol+1];
		double x3 = numGrid[currentRow][currentCol+2];
		double x4 = numGrid[currentRow][currentCol+3];

		value = x1*x2*x3*x4;
		System.out.println("Check Across: "+x1+", "+x2+", "+x3+", "+x4);
		System.out.println("Value: "+value);

		return value;
	}

	public static double checkVertical(double[][] numGrid, int currentRow, int currentCol){
		double value = 0;
		if(currentRow > 16) return value;

		double x1 = numGrid[currentRow][currentCol];
		double x2 = numGrid[currentRow+1][currentCol];
		double x3 = numGrid[currentRow+2][currentCol];
		double x4 = numGrid[currentRow+3][currentCol];

		value = x1*x2*x3*x4;
		System.out.println("Check Vertical: "+x1+", "+x2+", "+x3+", "+x4);
		System.out.println("Value: "+value);
		return value;
	}

	public static double checkRightDiagUp(double[][] numGrid, int currentRow, int currentCol){
		double value = 0;
		if(currentRow<3 || currentCol>16) return value;

		double x1 = numGrid[currentRow][currentCol];
		double x2 = numGrid[currentRow-1][currentCol+1];
		double x3 = numGrid[currentRow-2][currentCol+2];
		double x4 = numGrid[currentRow-3][currentCol+3];

		value = x1*x2*x3*x4;


		System.out.println("Check Right Diag Up: "+x1+", "+x2+", "+x3+", "+x4);
		System.out.println("Value: "+value);
		return value;
	}
	
	public static double checkRightDiagDown(double[][] numGrid, int currentRow, int currentCol){
		double value = 0;
		if(currentRow>16 || currentCol>16) return value;

		double x1 = numGrid[currentRow][currentCol];
		double x2 = numGrid[currentRow+1][currentCol+1];
		double x3 = numGrid[currentRow+2][currentCol+2];
		double x4 = numGrid[currentRow+3][currentCol+3];

		value = x1*x2*x3*x4;


		System.out.println("Check Right Diag Down: "+x1+", "+x2+", "+x3+", "+x4);
		System.out.println("Value: "+value);
		return value;
	}

	public static double checkLeftDiagUp(double[][] numGrid, int currentRow, int currentCol){
		double value = 0;
		if(currentCol < 3 || currentRow < 3) return value;
		double x1 = numGrid[currentRow][currentCol];
		double x2 = numGrid[currentRow-1][currentCol-1];
		double x3 = numGrid[currentRow-2][currentCol-2];
		double x4 = numGrid[currentRow-3][currentCol-3];

		value = x1*x2*x3*x4;
		System.out.println("Check left Diag Up: "+x1+", "+x2+", "+x3+", "+x4);
		System.out.println("Value: "+value);

		return value;
	}
	
	public static double checkLeftDiagDown(double[][] numGrid, int currentRow, int currentCol){
		double value = 0;
		if(currentCol < 3 || currentRow > 16) return value;
		double x1 = numGrid[currentRow][currentCol];
		double x2 = numGrid[currentRow+1][currentCol-1];
		double x3 = numGrid[currentRow+2][currentCol-2];
		double x4 = numGrid[currentRow+3][currentCol-3];

		value = x1*x2*x3*x4;
		System.out.println("Check left Diag Up: "+x1+", "+x2+", "+x3+", "+x4);
		System.out.println("Value: "+value);

		return value;
	}


	public static double[][] loadGrid(File file) throws FileNotFoundException{
		Scanner fileScanner = new Scanner(file);

		double[][] numGrid = new double[20][20];

		int currentRow =0;
		int currentCol =0;

		while(fileScanner.hasNextLine()){
			String numRow = fileScanner.nextLine();
			String[] nums = numRow.split(" ");
			for(String num : nums){
				numGrid[currentRow][currentCol] = Integer.parseInt(num);
				currentCol++;
			}
			currentRow++;
			currentCol=0;
		}

		return numGrid;
	}

	public static void printGrid(double[][] numGrid){
		for(double[] i : numGrid){
			for(double j : i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
