import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < length; i++){
			a.add(scan.nextInt());
		}
		
		ArrayList123.changeArray(a);
		
		System.out.println(a);
	}
	
	private static void changeArray(ArrayList<Integer> a){
		int x = a.size();
		for(int i = 0; i < x; i++){
			a.add(i + x, a.get(i));
			a.set(i, a.get(i) * 2);
		}
	}
}
