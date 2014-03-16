


public class Deduction extends Operation{
	public Matrix calculate (Matrix a, Matrix b){
		double[][] first = a.getArray();
	    double[][] second = b.getArray();
	    Matrix c = new Matrix(first.length, first[0].length);
	    double[][] result = c.getArray();
	    for (int i = 0; i < first.length; i++) {
	    	for (int j = 0; j < first[0].length; j++) {
	            result[i][j] = first[i][j] - second[i][j];
	         }
	      }
	      return c;
	}
}
