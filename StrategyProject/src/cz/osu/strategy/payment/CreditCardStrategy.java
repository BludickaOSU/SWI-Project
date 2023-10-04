package cz.osu.strategy.payment;

import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private LocalDate expirationDate;

    public CreditCardStrategy(String name, String cardNumber, String cvv, LocalDate expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Zaplaceno platební kartou, částka: " + amount);
    }
}
