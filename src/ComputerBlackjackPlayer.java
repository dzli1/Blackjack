
public class ComputerBlackjackPlayer extends BlackjackPlayer{
	private BlackjackStrategy p;
	ComputerBlackjackPlayer(BlackjackStrategy theStrategy){
		p=theStrategy;
	}
	public boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand) {
		return p.hit(playerHand.handValue(), dealerHand.handValue(), playerHand.soft());
	}

}
