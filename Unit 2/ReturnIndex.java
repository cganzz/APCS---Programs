import java.util.Scanner;


public class ReturnIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len];
		
		for(int i = 0; i < len; i++){
			arr[i] = scan.nextInt();
		}
		
		int x = scan.nextInt();
		
		System.out.println(ReturnIndex.pos(arr, x));
	}
	
	private static int pos(int[] arr, int x){
		int index = 0;
		int n = arr.length;
		int length = arr.length - 1;
		
		while(index <= length){
			int mid = (index + length) / 2;

			if(x > arr[mid]){
				index = mid + 1;
			}
			
			else if(x < arr[mid]){
				length = mid - 1;
			}
			
			else{
				if(mid == n - 1 || arr[mid] < arr[mid + 1]){
					index = mid;
					break;
				}
				index = mid;
			}
		}
		
		return index;
	}
}
