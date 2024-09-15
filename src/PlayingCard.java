import java.util.*;
public class PlayingCard {
	private int suit;
	private int value;	
	public static final int ACE=1;
	public static final int KING=13;
	public static final int QUEEN=12;
	public static final int JACK=11;	
	public static final int CLUBS=1;
	public static final int DIAMONDS=2;
	public static final int HEARTS=3;
	public static final int SPADES=4;	
	private static boolean random=true;	
	PlayingCard(int s, int v){
		value=v;
		suit=s;
	}
	PlayingCard(){
		if (random==true) {
			suit=(int)(Math.random()*4)+1;
			value=(int)(Math.random()*13)+1;
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a face value: ");	
			String a=sc.next();
			if (a.equalsIgnoreCase("ace")||a.equalsIgnoreCase("a")||a.equals("1")) 
				value=PlayingCard.ACE;
			else if(a.equalsIgnoreCase("king")||a.equalsIgnoreCase("k")||a.equals("13"))
				value=PlayingCard.KING;
			else if(a.equalsIgnoreCase("queen")||a.equalsIgnoreCase("q")||a.equals("12"))
				value=PlayingCard.QUEEN;
			else if(a.equalsIgnoreCase("jack")||a.equalsIgnoreCase("j")||a.equals("11"))
				value=PlayingCard.JACK;
			else 
				value=Integer.parseInt(a);
			System.out.print("Enter a suit: ");
			String b=sc.next();
			if (b.equalsIgnoreCase("club")||b.equalsIgnoreCase("c")||b.equalsIgnoreCase("clubs")||b.equals("1"))
				suit=PlayingCard.CLUBS;
			else if (b.equalsIgnoreCase("diamond")||b.equalsIgnoreCase("d")||b.equalsIgnoreCase("diamonds")||b.equals("2"))
				suit=PlayingCard.DIAMONDS;
			else if (b.equalsIgnoreCase("heart")||b.equalsIgnoreCase("h")||b.equalsIgnoreCase("hearts")||b.equals("3"))
				suit=PlayingCard.HEARTS;
			else if (b.equalsIgnoreCase("spade")||b.equalsIgnoreCase("s")||b.equalsIgnoreCase("spades")||b.equals("4"))
				suit=PlayingCard.SPADES;
		}
	}
	public int getSuit(){
		return suit;
	}
	public int getValue(){
		return value;
	}
	public String toString() {
		String a="";
		String b="";
		if (value>=2&&value<=10)
			a=String.valueOf(value);	
		else if(value==PlayingCard.ACE) 
			a="ACE";
		else if(value==PlayingCard.JACK) 
			a="JACK";
		else if(value==PlayingCard.QUEEN) 
			a="QUEEN";	
		else if(value==PlayingCard.KING) 
			a="KING";
		if (suit==PlayingCard.CLUBS)
			b="CLUBS";
		else if(suit==PlayingCard.DIAMONDS)
			b="DIAMONDS";
		else if(suit==PlayingCard.HEARTS)
			b="HEARTS";
		else if(suit==PlayingCard.SPADES)
			b="SPADES";
		return a+" of "+b;
	}
	public static void setRandom(boolean b) {
		random=b;
	}
}
	
