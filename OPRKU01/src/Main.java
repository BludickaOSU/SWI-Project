import java.time.LocalDate;
import java.util.List;
import billionaires.data.FileProvider;
import billionaires.manager.BillionairesManager;
import billionaires.model.Billionaire;
import strategy.manager.ShoppingCart;
import strategy.model.Item;
import strategy.payment.CreditCardStrategy;
import strategy.payment.PaypalStrategy;

public class Main {
    public static void main(String[] args) {




        public class Main {

            public static void main(String[] args) {
                // write your code here
                Item item = new Item("Hrnek", 299.90);
                Item item1 = new Item("Talíř", 449.90);
                ShoppingCart shoppingCart = new ShoppingCart();

                shoppingCart.addItem(item);
                shoppingCart.addItem(item1);
                shoppingCart.pay(new PaypalStrategy("hrncir@gmail.com", "asdfqwer"));
                shoppingCart.pay(new CreditCardStrategy("Tomáš Paci", "1144-5589-7663-4698", "321", LocalDate.of(2025, 1, 1)));


                List<String> text = FileProvider.fileToStringLines("./billionaires.csv");


                BillionairesManager billionairesManager = new BillionairesManager();
                for (Billionaire billionaire : billionairesManager.getBillionaires()) {
                    System.out.println(billionaire);
                }

                System.out.println();

                System.out.println(billionairesManager.getMostRichInYear(2014));
            }
        }


    }
}