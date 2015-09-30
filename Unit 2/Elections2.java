import java.util.Scanner;

public class Elections2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int candCount = scan.nextInt();
		int cityCount = scan.nextInt();
		int[] citiesWon = new int[candCount];
		
		for(int i = 0; i < cityCount; i++){
			double bestVal = Double.NEGATIVE_INFINITY;
			int bestCand = 0;
			
			for(int j = 0; j < candCount; j++){
				int cand = scan.nextInt();
				if(cand > bestVal){
					bestVal = cand;
					bestCand = j;
				}
			}
			
			citiesWon[bestCand]++;
		}
		
		double mostCities = Double.NEGATIVE_INFINITY;
		int winner = 0;
		
		for(int j = 0; j < candCount; j++){
			if(citiesWon[j] > mostCities){
				mostCities = citiesWon[j];
				winner = j;
			}
		}
		
		System.out.println(winner + 1);
	}
}
