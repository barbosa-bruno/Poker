import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<cards> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<cards>();
    }

    void addCard (cards card) {
        hand.add(card);
    }

    public ArrayList<cards> getHand() {
        return hand;
    }

    public String toString() {
        return name + "'s hand" + hand;
    }
}
