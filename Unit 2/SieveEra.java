import java.util.Scanner;

public class SieveEra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		boolean[] check = new boolean[num + 2];
		
		for(int i = 2; i < num + 1; i++){
			if(!check[i])
				for(int j = i * i; j < num + 1; j = j + i){
					check[j] = true;
				}
		}
		
		for(int i = 2; i < num + 1; i++){
			if(!check[i])
				System.out.print(i + " ");
		}
	}
}
