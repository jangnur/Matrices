import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class PrintRead {
	public Matrix readMatrix (String path) throws FileNotFoundException {
		Scanner input = new Scanner (new File(path));
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		/* Комментарий здесь для меня. В файле сначала количество строк и столбцов, а затем сама матрица*/
		/*Scanner columnReader = new Scanner(input.nextLine());
	    while (columnReader.hasNextDouble()) {
	        ++columns;
	    }
	    columnReader.close();
	    input.close();
	    Scanner inputR = new Scanner (new File(path));
		while (inputR.hasNextLine()) {
		    ++rows;
		}
		input.close();
		inputR.close();*/
		Matrix a = new Matrix(rows, columns);
	    double[][] x = a.getArray();
		for (int i = 0; i < rows; ++i) {
		    for (int j = 0; j < columns; ++j) {
		        if (input.hasNextDouble()) {
		            x[i][j] = input.nextDouble();
		        }
		    }
		}
		
		input.close();
		return a;
	}
	
	public Matrix readMatrix () {
		Scanner input = new Scanner (System.in);
		int rows = input.nextInt();
		int columns = input.nextInt();

		Matrix a = new Matrix(rows, columns);
	    double[][] x = a.getArray();
		input = new Scanner (System.in);
		for (int i = 0; i < rows; ++i) {
		    for (int j = 0; j < columns; ++j) {
		        if (input.hasNextDouble()) {
		            x[i][j] = input.nextDouble();
		        }
		    }
		}
		
		return a;
	}
	
	public void printMatrix (Matrix a) {
		double[][] mat = a.getArray();
		for (int i = 0; i < mat.length; ++i){
			for (int j = 0; j < mat[0].length; ++j){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void printMatrix (Matrix a, String path) throws FileNotFoundException {
		PrintWriter printer = new PrintWriter (path); 
		double[][] mat = a.getArray();
		for (int i = 0; i < mat.length; ++i){
			for (int j = 0; j < mat[0].length; ++j){
				printer.print(mat[i][j] + " ");
			}
			printer.println();
		}
		
		printer.close();
	}
}
