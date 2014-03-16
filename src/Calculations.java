
public class Calculations {
	public static double determinant (Matrix a) {
		double[][] array = a.getArray();
		double result = 0; 
		  if (array.length == 1) { 
		    result = array[0][0]; 
		    return result; 
		  } 
		  
		  if (array.length == 2) { 
		    result = array[0][0] * array[1][1] - array[0][1] * array[1][0]; 
		    return result; 
		  } 

		  for (int i = 0; i < array[0].length; i++) { 
		    double temp[][] = new double[array.length - 1][array[0].length - 1]; 

		    for(int j = 1; j < array.length; j++) { 
		    	System.arraycopy(array[j], 0, temp[j-1], 0, i); 
		    	System.arraycopy(array[j], i+1, temp[j-1], i, array[0].length-i-1); 
		    } 
		    Matrix b = new Matrix(temp, temp.length, temp[0].length);
		    
		    result += array[0][i] * Math.pow(-1, i) * determinant(b); 
		  } 
		  return result; 
	}
	
	public static Matrix multiply (Matrix a, double s) {
	    double[][] array = a.getArray();
		Matrix x = new Matrix(array.length, array[0].length);
	      double[][] c = x.getArray();
	      for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array[0].length; j++) {
	            c[i][j] = s*array[i][j];
	         }
	      }
	      return x;
	   }
	
	public static double trace (Matrix a) {
		double[][] first = a.getArray();
	    double trace = 0;  
	    for (int i = 0; i < Math.min(first.length, first[0].length); ++i) {
	         trace += first[i][i];
	      }
	      return trace;
	   }
}
