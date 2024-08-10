import java.util.ArrayList;

public class PokerGame {
    private Deck deck;
    private ArrayList<Player> players;
    private ArrayList<cards> communityCards;

    public PokerGame(String[] playerNames) {
        deck = new Deck();
        players = new ArrayList<>();
        communityCards = new ArrayList<>();

        for (String name : playerNames) {
            players.add(new Player(name));
        }

        dealHands();
        dealCommunityCards();
        displayHands();
        displayCommunityCards();
    }

    private void dealHands() {
        for (Player player : players) {
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
        }
    }

    private void dealCommunityCards() {
        for (int i = 0; i < 5; i++) {
            communityCards.add(deck.dealCard());
        }
    }

    private void displayHands() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    private void displayCommunityCards() {
        System.out.println("Community Cards: " + communityCards);
    }

    public static void main(String[] args) {
        String[] playerNames = {"Alice", "Bob", "Charlie"};
        new PokerGame(playerNames);
    }
}
