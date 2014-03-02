
public class Matrix {
	private double[][] a;
	private int m, n;
	
	/* 2d-array matrix constructor */
	public Matrix (double[][] a, int m, int n) {
	      this.a = a;
	      this.m = m;
	      this.n = n;
	   }
	
	/* zero matrix constructor */
	public Matrix (int m, int n) {
	      this.m = m;
	      this.n = n;
	      a = new double[m][n];
	   }

	/* 1d-array matrix constructor */
	public Matrix (double values[], int m) {
	      this.m = m;
	      if (m != 0)
	    	  n = values.length/m;
	      else n = 0;
	      a = new double[m][n];
	      for (int i = 0; i < m; i++) {
	         for (int j = 0; j < n; j++) {
	            a[i][j] = values[i+j*m];
	         }
	      }
	   }

	public double[][] getArray() {
	      return a;
	   }

	public Matrix transpose() {
	      Matrix x = new Matrix(n,m);
	      double[][] c = x.getArray();
	      for (int i = 0; i < m; i++) {
	         for (int j = 0; j < n; j++) {
	            c[j][i] = a[i][j];
	         }
	      }
	      return x;
	   }
}
