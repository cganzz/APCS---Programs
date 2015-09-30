import java.util.Scanner;

public class Bacteria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		
		int count = 0;
		for(int i = amount; i > 0; i = i / 2){
			if(i % 2 == 1)
				
				count++;
		}
		
		System.out.println(count);
	}
}
