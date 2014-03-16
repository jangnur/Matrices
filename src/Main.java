import java.io.FileNotFoundException;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Matrix cats = PrintRead.readMatrix("src/mat1.txt");
		Matrix dogs = PrintRead.readMatrix("src/mat2.txt");
		Operation o1 = new Multiplication();
		Matrix population = o1.calculate(dogs, cats);
		PrintRead.printMatrix(population, "src/res.txt");
		System.out.println("Determinant of cats is " + Calculations.determinant(cats));
	}

}
