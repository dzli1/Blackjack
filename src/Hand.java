import java.util.*;
public class Hand {
	private ArrayList<PlayingCard> a;
	Hand(int initialCards){
		a=new ArrayList<PlayingCard>();
		for (int i=0;i<initialCards;i++) {
			addCard();
		}
	}
	public int numberOfCards() {
		return a.size();
	}
	public PlayingCard nthCard(int n) {
		return a.get(n-1);
	}
	public void print() {
		for (PlayingCard s:a) {
			System.out.println(s);
		}
	}
	public void addCard(PlayingCard c) {
		a.add(c);
	}
	public void addCard() {
		PlayingCard c=new PlayingCard();
		addCard(c);
	}
}
