
public class BlackjackDealer {
	public double playBlackjack(BlackjackPlayer player, int numGames) {
		double count=0;	
		for (int i=0;i<numGames;i++) {
			BlackjackHand d1=new BlackjackHand(true);
			BlackjackHand p1=new BlackjackHand(false);
			boolean plhit=true;
			while(plhit&&p1.handValue()<22) {
				plhit=player.hit(d1, p1);
				if (plhit) {
					p1.addCard();
				}
			}
			if (p1.handValue()>21) {
				player.playerBusts(p1);
			}
			else{
				while(d1.handValue()<17) {
					d1.addCard();
					player.dealerHit(d1);
				}
				if (d1.handValue()>21) {
					player.dealerBusts(d1);
					count=count+1;
				}
				else {
					if (p1.handValue()>d1.handValue()) {
						player.playerWins(p1, d1);
						count=count+1;
					}
					else if (p1.handValue()==d1.handValue()) {
						player.playerTies(p1, d1);
						count=count+.5;
					}
					else {
						player.dealerWins(d1, p1);
					}
				}
			}	
		}
		return count/((double)numGames);	
	}
	public double compare(BlackjackStrategy a, BlackjackStrategy b) {
		BlackjackPlayer b1=new ComputerBlackjackPlayer(a);
		BlackjackPlayer b2=new ComputerBlackjackPlayer(b);
		int count=0;
		int count2=0;
		for (int i=0;i<1000;i++) {
			double d1=playBlackjack(b1, 1000);
			double d2=playBlackjack(b2, 1000);
			if (d1>d2) {
				count++;
			}
			if (d2>d1) {
				count2++;
			}
		}
		return (double)count/(double)(count+count2);
	}
}
