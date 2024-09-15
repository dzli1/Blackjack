
public class BlackjackHand extends Hand{
	private int handValue;
	private boolean soft;
	BlackjackHand(boolean dealer) {
		super(1);
		if (!dealer) {
			super.addCard();
		}
	}
	BlackjackHand(){
		super(0);
	}
	private void computeValue() {
		handValue=0;
		boolean aces=false;
		soft=false;	
		for (int i=0;i<super.numberOfCards();i++) {
			if (super.nthCard(i+1).getValue()==11||
			super.nthCard(i+1).getValue()==12||super.nthCard(i+1).getValue()==13) {
				handValue=handValue+10;
			}
			else {
				handValue=handValue+super.nthCard(i+1).getValue();
			}
			if (super.nthCard(i+1).getValue()==1) {
				aces=true;
			}
		}
		if (aces&&handValue<12) {
			handValue=handValue+10;
			soft=true;
		}	
			
	}
	public void addCard(PlayingCard c){
		super.addCard(c);
		computeValue();
	}	
	public void addCard(){
		super.addCard();
		computeValue();
	}
	public int handValue() {
		return handValue;
	}
	public boolean soft() {
		return soft;
	}
}
