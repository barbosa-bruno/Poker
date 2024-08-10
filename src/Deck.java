import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.shuffle;

public class Deck {

    private ArrayList<cards> cards;

    public Deck () {
        cards = new ArrayList<>();

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new cards(suit, rank));
            }
        }

        shuffle();
    }

    public void shuffle () {
        Collections.shuffle(cards);
    }

    public cards dealCard () {
        return cards.remove(0);
    }
}
