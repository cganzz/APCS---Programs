import java.util.Scanner;

public class CountPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What number do you want to go to?");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(CountPrimes.countPrimes(input));
	}
	
	public static int countPrimes(int n){
		int primes = 0;
		
		for(int i = 2; i <= n; i++){
			boolean isPrime = false;
			
			for(int j = 2; j < (i - 1); j++){
				if(i % j == 0){
					isPrime = true;
					break;
				}
			}
			
			if(!isPrime){
				primes++;
			}
		}
		return primes;
	}

}
