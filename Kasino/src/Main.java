public class Main {
    public static void main(String[] args) {

        CardShaker cardShaker = new CardShaker();
        System.out.println("Čerstvě vygenerovane karty");
        cardShaker.generateAllCards();
        cardShaker.printCards(cardShaker.cards);
        System.out.println("----------------------------------------");
        System.out.println("Zamíchane karty");
        cardShaker.shakeAllCards();
        cardShaker.printCards(cardShaker.cards);
        System.out.println("***********************");
        System.out.println("Karty podle barvy:");
        cardShaker.printCards(cardShaker.getCardsWithColor("red"));
        System.out.println("***********************");
        System.out.println("Karty podle ranku: ");
        cardShaker.printCards(cardShaker.getCardsWithRank("8"));
        System.out.println("***********************");
        System.out.println("Karty podle znaku: ");
        cardShaker.printCards(cardShaker.getCardsWithShape("pikes"));
        System.out.println("***********************");
        System.out.println("Nahodne karty: ");
        cardShaker.printCards(cardShaker.getRandomCards(5));
    }
}