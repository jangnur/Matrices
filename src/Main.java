import java.io.FileNotFoundException;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		PrintRead local = new PrintRead();
		Calculations spring = new Calculations();
		Matrix cats = local.readMatrix("src/mat1.txt");
		Matrix dogs = local.readMatrix("src/mat2.txt");
		Matrix population = spring.multiply(dogs, cats);
		local.printMatrix(population, "src/res.txt");
		double det = spring.determinant(cats);
		System.out.println("Determinant of cats is " + det);
	}

}
