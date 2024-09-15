//David Li
public class LiDavidStrategy extends BlackjackStrategy{
	public boolean hit(int handValue, int dealerHandValue, boolean soft) {
		boolean ans=false;
		if (!soft) {
			if (handValue>=17||(handValue>=13&&handValue<17&&dealerHandValue<7)
			||(handValue==12&&dealerHandValue>3&&dealerHandValue<7)) {
				ans=false;
			}
			else {
				ans=true;
			}
		}
		else {
			if (handValue<=17||(handValue==18&&dealerHandValue>8&&dealerHandValue<12)){
				ans=true;
			}
			else {
				ans=false;
			}
		}
		return ans;
	}
	public String author() {
		return "David L.";
	}
	public String playerName() {
		return "David L's Strategy";
	}
}
