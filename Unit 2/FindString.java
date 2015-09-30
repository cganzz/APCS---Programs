import java.util.Scanner;


public class FindString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int index = scan.nextInt();
		
		System.out.println(FindString.getExp(input, index));
	}
	
	private static String getExp(String str, int i){
		int count1 = 0;
		int count2 = 0;
		int goTo = 0;
		for(int j = i; i < str.length(); j++){
			if(str.charAt(j) == '(')
				count1++;
			else if(str.charAt(j) == ')')
				count2++;
			
			if(count1 != 0 && count2 != 0)
				if(count1 == count2){
					goTo = j;
					break;
				}
			
		}
		
		return str.substring(i, goTo + 1);
	}
}
