import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class App {
    public final HashMap<String, Integer> cards = new HashMap<>();
    public Queue<String> deck = new LinkedList<>();
    public static final Random rndm = new Random();
    public boolean facup = true;
    public List<String> dealerHand = new ArrayList<>();
    public List<String> playerHand = new ArrayList<>();
    public int dealerCount = 0;
    public int playerCount = 0;
    public boolean natural = false;
    public int dealerAce = 11;
    public int hidDealerCount = 0;

    App() {
        cards.put("A", 1);
        cards.put("2", 2);
        cards.put("3", 3);
        cards.put("4", 4);
        cards.put("5", 5);
        cards.put("6", 6);
        cards.put("7", 7);
        cards.put("8", 8);
        cards.put("9", 9);
        cards.put("10", 10);
        cards.put("J", 10);
        cards.put("Q", 10);
        cards.put("K", 10);
    }

    // Create Deck
    public void cDeck() {
        String cardStrings[] = cards.keySet().toArray(new String[cards.size()]);
        for (int i = 0; i < 312; i++) {
            String rCard = cardStrings[rndm.nextInt(cardStrings.length)];
            deck.add(rCard);
        }
    }

    // Print hand
    public void print() {
        System.out.println("Dealer Hand :" + dealerCount);
        for (int i = 0; i < dealerHand.size(); i++) {
            if (i == 1 && natural == false) {
                System.out.print(" * ");
            } else {
                System.out.print(" " + dealerHand.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println("Player Hand :" + playerCount);
        for (int i = 0; i < playerHand.size(); i++) {
            System.out.print(" " + playerHand.get(i) + " ");
        }
        System.out.println();
    }

    // COunt hand
    public void count() {
        dealerCount = 0;
        playerCount = 0;
        for (int i = 0; i < dealerHand.size(); i++) {
            switch (dealerHand.get(i)) {
                case "A":
                    if (i == 0 && natural == false) {
                        natural = true;
                        int sec = cards.get(dealerHand.get(i + 1));
                        if (11 + sec == 21) {
                            System.out.println("DEALER BLACKJACK");
                            System.out.println("The deler wins");
                            dealerCount = 21;
                            print();
                            System.exit(0);
                        }
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                        break;
                    }
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "1":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "2":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "3":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "4":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "5":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "6":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "7":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "8":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "9":
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "10":
                    if (i == 0 && natural == false) {
                        natural = true;
                        int sec = cards.get(dealerHand.get(i + 1));
                        if (dealerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("DEALER BLACKJACK");
                            System.out.println("The deler wins");
                            dealerCount = 21;
                            print();
                            System.exit(0);
                        }
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                        break;
                    }
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "J":
                    if (i == 0 && natural == false) {
                        natural = true;
                        int sec = cards.get(dealerHand.get(i + 1));
                        if (dealerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("DEALER BLACKJACK");
                            System.out.println("The deler wins");
                            dealerCount = 21;
                            print();
                            System.exit(0);
                        }
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                        break;
                    }
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "Q":
                    if (i == 0 && natural == false) {
                        natural = true;
                        int sec = cards.get(dealerHand.get(i + 1));
                        if (dealerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("DEALER BLACKJACK");
                            System.out.println("The deler wins");
                            dealerCount = 21;
                            print();
                            System.exit(0);
                        }
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                        break;
                    }
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
                case "K":
                    if (i == 0 && natural == false) {
                        natural = true;
                        int sec = cards.get(dealerHand.get(i + 1));
                        if (dealerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("DEALER BLACKJACK");
                            System.out.println("The deler wins");
                            dealerCount = 21;
                            print();
                            System.exit(0);
                        }
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                        break;
                    }
                    if (!(i == 1 && natural == false))
                        dealerCount = dealerCount + cards.get(dealerHand.get(i));
                    break;
            }
        }
        for (int i = 0; i < playerHand.size(); i++) {
            switch (playerHand.get(i)) {
                case "A":
                    if (i == 0) {
                        int sec = cards.get(playerHand.get(i + 1));
                        if (11 + sec == 21) {
                            System.out.println("PLAYER BLACKJACK");
                            System.out.println("You win");
                            playerCount = 21;
                            print();
                            System.exit(0);
                        }
                    }
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "1":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "2":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "3":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "4":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "5":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "6":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "7":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "8":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "9":
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "10":
                    if (i == 0) {
                        int sec = cards.get(playerHand.get(i + 1));
                        if (playerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("PLAYER BLACKJACK");
                            System.out.println("You win");
                            playerCount = 21;
                            print();
                            System.exit(0);
                        }
                    }
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "J":
                    if (i == 0) {
                        int sec = cards.get(playerHand.get(i + 1));
                        if (playerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("PLAYER BLACKJACK");
                            System.out.println("You win");
                            playerCount = 21;
                            print();
                            System.exit(0);
                        }
                    }
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "Q":
                    if (i == 0) {
                        int sec = cards.get(playerHand.get(i + 1));
                        if (playerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("PLAYER BLACKJACK");
                            System.out.println("You win");
                            playerCount = 21;
                            print();
                            System.exit(0);
                        }
                    }
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
                case "K":
                    if (i == 0) {
                        int sec = cards.get(playerHand.get(i + 1));
                        if (playerHand.get(i + 1).equals("A"))
                            sec = 11;
                        if (10 + sec == 21) {
                            System.out.println("PLAYER BLACKJACK");
                            System.out.println("You win");
                            playerCount = 21;
                            print();
                            System.exit(0);
                        }
                    }
                    playerCount = playerCount + cards.get(playerHand.get(i));
                    break;
            }
        }
        if (dealerCount == 21) {
            System.out.println("DEALER BLACKJACK");
            System.out.println("The dealer wins");
            print();
            System.exit(0);
        }
        if (dealerCount > 21) {
            System.out.println("DEALER BUST");
            System.out.println("You win");
            print();
            System.exit(0);
        }
        if (playerCount == 21) {
            System.out.println("PLAYER BLACKJACK");
            System.out.println("You win");
            print();
            System.exit(0);
        }
        if (playerCount > 21) {
            System.out.println("PLAYER BUST");
            System.out.println("You loose");
            print();
            System.exit(0);
        }
    }

    public void game() {
        Scanner in = new Scanner(System.in);
        cDeck();
        int turn = 0;
        String c;
        dealerHand.add(deck.poll());
        playerHand.add(deck.poll());
        dealerHand.add(deck.poll());
        playerHand.add(deck.poll());
        count();
        print();
        while (true) {
            switch (turn) {
                case 0:
                    System.out.println("Do you want to HIT or STAND?");
                    c = in.next();
                    c = c.toLowerCase();
                    natural = true;
                    switch (c) {
                        case "hit":
                            playerHand.add(deck.poll());
                            count();
                            print();
                            break;
                        case "stand":
                            System.out.println("You stand");
                            count();
                            print();
                            break;
                        default:
                            System.out.println("Enter correct input(HIT or STAND).");
                            continue;
                    }
                    turn++;
                    break;
                case 1:
                    natural = true;
                    count();
                    if (dealerCount > playerCount) {
                        System.out.println("The dealer stands");
                    } else {
                        System.out.println("The dealer hits");
                        if (deck.peek().equals("A")) {
                            if (!(11 + dealerCount > 21)) {
                                cards.put("A", 11);
                            }
                        }
                        dealerHand.add(deck.poll());
                        count();
                        print();
                    }
                    turn--;
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.game();
    }
}
