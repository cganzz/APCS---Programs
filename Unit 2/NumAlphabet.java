import java.util.Scanner;


public class NumAlphabet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] list = new int[num];
		
		for(int i = 0; i < num; i++){
			list[i] = scan.nextInt();
		}
		
		for(int i = num - 1; i > 0; i--){
			
			if(list[i] > list[i - 1]){
				
				for(int j = num - 1; j >= i; j--){
					
					if(list[i - 1] < list[j]){
						int x = list[i - 1];
						list[i - 1] = list[j];
						list[j] = x;
						break;
					}
				}
				
				int y = i;
				int z = num - 1;
				
				while(y < z){
					int sub = list[y];
					list[y] = list[z];
					list[z] = sub;
					y++;
					z--;
				}
				
				break;
			}
		}
		
		for(int i = 0; i < num; i++){
			System.out.print(list[i] + " ");
		}
	}
}
