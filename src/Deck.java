import java.util.*;
public class Deck {
    private List<Card> unDealt;
    private List<Card> dealt;

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
}
