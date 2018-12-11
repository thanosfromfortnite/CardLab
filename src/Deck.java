import java.util.*;
public class Deck {
    private ArrayList<Card> unDealt = new ArrayList<Card>();
    private ArrayList<Card> dealt = new ArrayList<Card>();

    public Deck(String[] rank, String[] suit, int[] pointValue) {
        for (int i = 0; i < rank.length; i ++) {
            for (int j = 0; j < suit.length; j ++) {
                for (int k = 0; k < pointValue.length; k ++) {
                    unDealt.add(new Card(rank[i], suit[j], pointValue[k]));
                }
            }
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
            unDealt.remove(i);
        }
        for (int i = 0; i < unDealt.size(); i ++) {
            int r = (int) (Math.random() * unDealt.size());
            Card c = unDealt.get(r);
            unDealt.remove(i);
            unDealt.add(c);
        }
    }
}
