import java.util.HashMap;

public class Blackjack {
    private static final HashMap<String, Integer> CardsValue = new HashMap<String, Integer>();
    private static final int BLACKJACK = 21;
    /*
        Decision domain:
        S = Stand
        H = Hit
        P = Split
        W = Automatically win
     */

    static {
        CardsValue.put("ace", 11);
        CardsValue.put("two", 2);
        CardsValue.put("three", 3);
        CardsValue.put("four", 4);
        CardsValue.put("five", 5);
        CardsValue.put("six", 6);
        CardsValue.put("seven", 7);
        CardsValue.put("eight", 8);
        CardsValue.put("nine", 9);
        CardsValue.put("ten", 10);
        CardsValue.put("jack", 10);
        CardsValue.put("queen", 10);
        CardsValue.put("king", 10);
    }
    public int parseCard(String card) {
        return CardsValue.getOrDefault(card, 0);
    }

    public boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2)) == BLACKJACK;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        return ((!isBlackjack) ? "P" :
                (dealerScore < 10) ? "W" : "S");
    }

    public String smallHand(int handScore, int dealerScore) {
        return ((0 <= handScore && handScore <= 11) ? "H" :
                (12 <= handScore && handScore <= 16) && (dealerScore >= 7) ? "H" : "S");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
