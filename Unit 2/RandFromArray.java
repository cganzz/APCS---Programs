import java.util.Scanner;

public class RandFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		
		for(int i = 0; i < 5; i++){
			array[i] = i;
		}
		
		System.out.print(RandFromArray.choice(array));
	}
	
	private static int choice(int[] arr){
		int choice = arr[(int) (Math.random() * (arr.length))];
		return choice;
	}
}
