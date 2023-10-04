package cz.osu.strategy.manager;

import cz.osu.strategy.model.Item;
import cz.osu.strategy.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double sum = 0;

        for (Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        double amount = getTotalPrice();
        paymentMethod.pay(amount);
    }
}
