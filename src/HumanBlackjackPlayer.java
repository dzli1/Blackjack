import java.util.*;
public class HumanBlackjackPlayer extends BlackjackPlayer {
	public boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand) {
		System.out.println("Dealer Hand:");
		dealerHand.print();
		System.out.println("Player Hand:");
		playerHand.print();
		System.out.println("Would you like to hit?");
		Scanner sc=new Scanner(System.in);
		boolean ans=true;
		String a=sc.next();
		if (a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("y")||a.equals("hit")) {
			return true;
		}
		else if (a.equalsIgnoreCase("stand")||a.equalsIgnoreCase("no")||a.equals("n")) {
			return false;
		}
		else {	
			boolean error=true;
			while (error) {
				System.out.println("Answer can not be recognized. Would yo"
				+ "u like to hit? Please type YES or NO.");
				a=sc.next();
				if (a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("y")||a.equals("hit")) {
					ans=true;
					error=false;
				}
				else if (a.equalsIgnoreCase("stand")||a.equalsIgnoreCase("no")||a.equals("n")) {
					error=false;
					ans=false;
				}
			}
		}
		return ans;
	}
	public void dealerHit(BlackjackHand dealerHand) {
		System.out.println("Dealer Hand:");
		dealerHand.print();
		System.out.println("The dealer hit.");
	}
	public void playerBusts(BlackjackHand playerHand) {
		System.out.println("Player Hand:");
		playerHand.print();
		System.out.println("You busted.");
		System.out.println("______________________________________"+
		"___________________________________________");
		System.out.println("");
	}
	public void playerTies(BlackjackHand playerHand, BlackjackHand dealerHand) {
		System.out.println("Dealer Hand:");
		dealerHand.print();
		System.out.println("Player Hand:");
		playerHand.print();
		System.out.println("You and the dealer tied.");
		System.out.println("______________________________________"+
		"___________________________________________");
		System.out.println("");
	}
	public void playerWins(BlackjackHand playerHand, BlackjackHand dealerHand) {
		System.out.println("Dealer Hand:");
		dealerHand.print();
		System.out.println("Player Hand:");
		playerHand.print();
		System.out.println("You won.");
		System.out.println("______________________________________"+
		"___________________________________________");
		System.out.println("");
	}
	public void dealerBusts(BlackjackHand dealerHand) {
		System.out.println("Dealer Hand:");
		dealerHand.print();
		System.out.println("The dealer busted.");
		System.out.println("______________________________________"+
		"___________________________________________");
		System.out.println("");
	}
	public void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand) {
		System.out.println("Dealer Hand:");
		dealerHand.print();
		System.out.println("Player Hand:");
		playerHand.print();
		System.out.println("The dealer won.");
		System.out.println("______________________________________"+
		"___________________________________________");
		System.out.println("");
	}
}
