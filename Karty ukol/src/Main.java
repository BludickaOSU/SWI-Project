import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    Card h7 = new Card("Red","7","Hearts");
    Card h8 = new Card("Red","8","Hearts");
    Card h9 = new Card("Red","9","Hearts");
    Card h10 = new Card("Red","10","Hearts");
    Card hJ = new Card("Red","J","Hearts");
    Card hQ = new Card("Red","Q","Hearts");
    Card hK = new Card("Red","K","Hearts");
    Card hA = new Card("Red","A","Hearts");

    Card d7 = new Card("Red","7","Diamonds");
    Card d8 = new Card("Red","8","Diamonds");
    Card d9 = new Card("Red","9","Diamonds");
    Card d10 = new Card("Red","10","Diamonds");
    Card dJ = new Card("Red","J","Diamonds");
    Card dQ = new Card("Red","Q","Diamonds");
    Card dK = new Card("Red","K","Diamonds");
    Card dA = new Card("Red","A","Diamonds");

    Card p7 = new Card("Black","7","Pikes");
    Card p8 = new Card("Black","8","Pikes");
    Card p9 = new Card("Black","9","Pikes");
    Card p10 = new Card("Black","10","Pikes");
    Card pJ= new Card("Black","J","Pikes");
    Card pQ = new Card("Black","Q","Pikes");
    Card pK = new Card("Black","K","Pikes");
    Card pA = new Card("Black","A","Pikes");

    Card c7 = new Card("Black","7","Clovers");
    Card c8 = new Card("Black","8","Clovers");
    Card c9 = new Card("Black","9","Clovers");
    Card c10 = new Card("Black","10","Clovers");
    Card cJ= new Card("Black","J","Clovers");
    Card cQ = new Card("Black","Q","Clovers");
    Card cK = new Card("Black","K","Clovers");
    Card cA = new Card("Black","A","Clovers");



    CardShaker[] cs = new CardShaker[32];


        System.out.println(Arrays.toString(cs));

    }
}