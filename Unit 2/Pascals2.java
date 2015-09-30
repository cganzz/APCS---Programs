import java.util.Scanner;

public class Pascals2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pascNum = scan.nextInt() + 1;
		int tri[][] = new int[pascNum][pascNum];
		
		for(int i = 0; i < pascNum; i++){
			for(int j = 0; j < i; j++){
				if(j == 0)
					tri[i][j] = 1;
				else
					tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
			}
		}
		
		for(int i = 0; i < pascNum; i++){
			for(int j = 0; j < i; j++){
				System.out.print(tri[i][j] + " ");
			}
			System.out.println();
		}
	}
}
