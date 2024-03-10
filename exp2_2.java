import java.util.*;

class Card {
    String symbol;
    int number;

    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class exp2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Card> cardSet = new HashSet<>();
        Set<String> symbolSet = new HashSet<>();

        while (symbolSet.size() < 4) {
            System.out.println("Enter a card:");
            String symbol = scanner.nextLine();
            int number = scanner.nextInt();
            scanner.nextLine();
            Card card = new Card(symbol, number);
            if (symbolSet.add(symbol)) {
                cardSet.add(card);
            }
            System.out.println("Four symbols gathered in " + cardSet.size() + " cards.");
        }

        System.out.println("\nCards in Set are:");
        for (Card card : cardSet) {
            System.out.println(card);
        }
        scanner.close();
    }
}
