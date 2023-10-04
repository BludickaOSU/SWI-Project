import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CardShaker {
    Card[] cards;

    public CardShaker() {
        cards = new Card[32];
    }

    public void generateAllCards(){
        String[] rank = { "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] shape = { "hearts", "diamonds", "pikes", "clovers" };
        int i =0;

        for (String r:rank){
            for (String s:shape){
                String c = (s.equals("diamonds") || s.equals("hearts") ? "red" : "black");
                cards[i++] = new Card(c, r, s);
            }
        }
    }

    public void shakeAllCards(){
        ArrayList<Card> shakenCards = new ArrayList<>(Arrays.asList(cards));

        Collections.shuffle(shakenCards);

        cards = shakenCards.toArray(new Card[0]);
    }

    public void printCards(Card[] cardsToPrint) {

        for(Card c : cardsToPrint) c.printInfo();
    }

    public Card[] getCardsWithColor(String reguiredColor){
        ArrayList<Card> outColor = new ArrayList<>();

        for (Card c:cards){
            if (c.getColor().equals(reguiredColor)){
                outColor.add(c);
            }
        }
        return outColor.toArray(new Card[0]);
    }
    public Card[] getCardsWithRank(String reguiredRank){
        ArrayList<Card> outRank = new ArrayList<>();
        for (Card c:cards){
            if (c.getRank().equals(reguiredRank)){
                outRank.add(c);
            }
        }return outRank.toArray(new Card[0]);
    }
    public Card[] getCardsWithShape(String requiredShape){
        ArrayList<Card> outShape = new ArrayList<>();
        for (Card c:cards){
            if (c.getShape().equals(requiredShape)){
                outShape.add(c);
            }
        }return outShape.toArray(new Card[0]);
    }

    public Card[] getRandomCards(int count) {
        // nový list pro vrácené hodnoty
        ArrayList<Card> outList = new ArrayList<>();
        // nový list kde nacpu původní pole a odkud budu brát náhodné karty
        ArrayList<Card> cardsList = new ArrayList<>(Arrays.asList(cards));
        // nový Random odkud budu brát náhodný hodnoty
        Random rnd = new Random();

        // projeď list x krát
        for(int i = 0; i < count; i++) {
            int ri = rnd.nextInt(cardsList.size());
            outList.add(cardsList.get(ri));
            cardsList.remove(ri);
        }
        // vrať mi pole z out listu
        return outList.toArray(new Card[0]);
    }



}
