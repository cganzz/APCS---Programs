import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiples1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows1 = scan.nextInt();
		int cols1 = scan.nextInt();
		int[][] matrix1 = new int[rows1][cols1];
		
		for(int i = 0; i < rows1; i++){
			for(int j = 0; j < cols1; j++){
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		int rows2 = scan.nextInt();
		int cols2 = scan.nextInt();
		int[][] matrix2 = new int[rows2][cols2];
		
		for(int i = 0; i < rows2; i++){
			for(int j = 0; j < cols2; j++){
				matrix2[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(MatrixMultiples1.giveMatrix(matrix1, matrix2)));
	}
	
	private static int[][] giveMatrix(int[][] first, int[][]second){
		int[][] matrix = new int[first.length][second[0].length];
		
		for(int i = 0; i < first.length; i++){
			for(int j = 0; j < second[0].length; j++){
				for(int k = 0; k < second.length; k++){
					matrix[i][j] += first[i][k] * second[k][j];
				}
			}
		}
		
		return matrix;
	}

}
