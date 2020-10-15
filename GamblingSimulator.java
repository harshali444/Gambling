public class GamblingSimulator {

	 public static void main(String[] args) {
		 System.out.println("Welcome to Gambling Simulator");
		 final int STAKE=100;
		 final int BETS=1;
		 GamblingSimulator Gambling = new GamblingSimulator();
		 Gambling.winner();
	}
          public void winner() {
		int Random = (int)Math.round(Math.random()*100)%2;
		if(Random == 1)
			System.out.println("Player is a winner");
		else
			System.out.println("Player is lose the bet");

		}

}
