
public class Fibonacci {

	/**
	 */
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();
		System.out.println(Fibonacci.giveNum(input));*/
		long one = 1;
		long two = 1;
		long fib = 1;
		for(long i = 1; i <= 10; i++){
			if(i == 1 || i == 2)
			    System.out.println(fib);
			else{
				fib = one + two;
				one = two;
				two = fib;
				System.out.println(fib);
			}
		}
	}
	
	/*public static long giveNum(long x){
		  long one = 1;
		  long two = 1;
		  long fib = 1;
		  for(long i = 3; i <= x; i++){ 
			  fib = one + two;
			  one = two;
			  two = fib;
		  }
		  return fib;
	}*/

}
