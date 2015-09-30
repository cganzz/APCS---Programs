import java.util.Scanner;

public class Game24Test {

	/**
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input <= 3)
			System.out.println("NO");
		else{
			System.out.println("YES");
			if(input % 2 == 0){
				int times = 0;
				for(int i = input; i > 4; i -= 2){
					System.out.println(i + " - " + (i - 1) + " = " + 1);
					times++;
				}
				System.out.println(1 + " * " + 2 + " = " + 2);
				System.out.println(2 + " * " + 3 + " = " + 6);
				System.out.println(6 + " * " + 4 + " = " + 24);
				for(int i = 0; i < times; i++){
					System.out.println(24 + " * " + 1 + " = " + 24);
				}
			}
			
			else if(input % 2 != 0){
				int times = 0;
				for(int i = input; i > 5; i -= 2){
					System.out.println(i + " - " + (i - 1) + " = " + 1);
					times++;
				}
				System.out.println(5 + " * " + 4 + " = " + 20);
				System.out.println(3 + " + " + 2 + " = " + 5);
				System.out.println(5 + " - " + 1 + " = " + 4);
				System.out.println(20 + " + " + 4 + " = " + 24);
				for(int i = 0; i < times; i++){
					System.out.println(24 + " * " + 1 + " = " + 24);
				}
			}
		}
	}
}
