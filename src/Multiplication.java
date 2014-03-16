



	public class Multiplication extends Operation{
		public Matrix calculate (Matrix a, Matrix b){
			double[][] first = a.getArray();
		    double[][] second = b.getArray();
		    Matrix c = new Matrix(first.length, first[0].length);
		    double[][] result = c.getArray();
		    if (second.length != first[0].length) {
		         throw new IllegalArgumentException("Matrix dimensions must be the same.");
		    }
		 
		    double[] bColumnJ = new double[second.length];
		    for (int j = 0; j < second[0].length; ++j) {
		    	for (int k = 0; k < first[0].length; ++k) {
		            bColumnJ[k] = second[k][j];
		         }
		         for (int i = 0; i < first.length; ++i) {
		            double[] aRowI = first[i];
		            double s = 0;
		            for (int k = 0; k < first[0].length; ++k) {
		               s += aRowI[k] * bColumnJ[k];
		            }
		            result[i][j] = s;
		         }
		      }
		      return c;
		}
	}


