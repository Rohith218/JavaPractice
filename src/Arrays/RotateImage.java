package Arrays;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void rotate(int[][] matrix) {
        int n = matrix.length;
        
       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               // swap matrix[i][j] and matrix[j][i]
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
       for (int i = 0; i < n; i++) {
           int left = 0, right = n - 1;
           while (left < right) {
               int temp = matrix[i][left];
               matrix[i][left] = matrix[i][right];
               matrix[i][right] = temp;
               left++;
               right--;
           }
       }
   }

}
