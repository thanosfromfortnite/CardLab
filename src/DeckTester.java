public class DeckTester {

    public static void main(String[] args) {
        String[] ranks = new String[53];
        String[] suits = new String[53];
        int[] powerValues = new int[53];
        String[] listOfRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] listOfSuits = {"Diamonds", "Clubs", "Hearts", "Spades"};
        for (int i = 0; i < listOfRanks.length; i ++) {
            for (int j = 0; j < listOfSuits.length; j ++) {
                ranks[(i * 4) + j] = listOfRanks[i];
                suits[(i * 4) + j] = listOfSuits[j];
                powerValues[(i * 4) + j] = (i * 4) + j + 1;
            }
        }
        Deck deck = new Deck(ranks, suits, powerValues);
        System.out.println("================= \nUNSHUFFLED");
        for (int i = 0; i < 52; i  ++) {
            System.out.println(deck.deal().toString());
        }

        deck.shuffle();

        System.out.println("================= \nSHUFFLED");
        for (int i = 0; i < 52; i ++) {
            System.out.println(deck.deal().toString());
        }
    }
}
