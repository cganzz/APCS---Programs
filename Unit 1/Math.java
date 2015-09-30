public class MathTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Math.add(10.0, 5.0));
		System.out.println(Math.subtract(10.0, 5.0));
		System.out.println(Math.multiply(19.0, 19.0));
		System.out.println(Math.divide(10.0, 5.0));
		System.out.println(Math.exponent(10.0, 5.0));
		System.out.println(Math.mod(13, 5));
		System.out.printf("%.4f", Math.squareRoot(.054));
	}

}

public class Math {
	private static double num = 0;
	private static long num1 = 0;
	private static int num2 = 0;

	public static double add(double x, double y){
		num = x + y;
		return num;
	}
	
	public static double multiply(double x, double y){
		num = x * y;
		return num;
	}
	
	public static double divide(double x, double y){
		num = x / y;
		return num;
	}

	public static double subtract(double x, double y) {
		num = x - y;
		return num;
	}
	
	public static long exponent(double x, double y){
		num1 = (long) x;
		for(double i = 0; i < y; i++){
			num1 = (long) (num1 * y);
		}
		return num1;
	}
	
	public static int mod(int x, int y) {
		num2 = x / y;
		int num1 = (int) (num * y);
		return x - num1;
	}
	
	public static double squareRoot(double x){
		double g1;

	    double squareRoot = x / 2;
	    do
	    {
	    	g1 = squareRoot;
	        squareRoot = (g1 + (x / g1))/2;
	    }
	    while((g1 - squareRoot) != 0);
	        
		return squareRoot;
	}
}
