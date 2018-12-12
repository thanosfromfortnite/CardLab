import java.util.*;
public class Deck {
    private ArrayList<Card> unDealt = new ArrayList<Card>();
    private ArrayList<Card> dealt = new ArrayList<Card>();

    public Deck(String[] rank, String[] suit, int[] pointValue) {
        for (int i = 0; i < pointValue.length; i ++) {
            unDealt.add(new Card(rank[i], suit[i], pointValue[i]));
        }
    }

    public boolean isEmpty() {
        return unDealt.size() == 0;
    }

    public int size() {
        return unDealt.size();
    }

    public Card deal() {
        if (unDealt.size() != 0) {
            Card card = unDealt.get(0);
            dealt.add(card);
            unDealt.remove(0);
            return card;
        }
        else return null;
    }

    public void shuffle() {
        for (int i = 0; i < dealt.size(); i ++) {
            unDealt.add(dealt.get(0));
            dealt.remove(0);
        }
        for (int k = 51; k > 0; k --) {
            int r = (int) (Math.random() * (k + 1));
            Card c = unDealt.get(r);
            unDealt.set(r, unDealt.get(k));
            unDealt.set(k, c);
        }
    }
}
