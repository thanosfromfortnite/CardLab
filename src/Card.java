public class Card {

    private String rank; // The name of the card.
    private String suit; // The suit, duh
    private int pointValue; // point values

    public Card(String rank, String suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public boolean equals(Card otherCard) {
        return this.pointValue == otherCard.pointValue;
    }

    public String toString() {
        return "Rank: " + this.rank + "\nSuit: " + this.suit + "\nPoint value: " + this.pointValue;
    }
}
