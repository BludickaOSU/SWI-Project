package com.company;

public class BankingService {
    private String nameOfBank;
    private int fees;
    private String locationOfBank;

    public BankingService(String nameOfBank, int fees, String locationOfBank) {
        this.nameOfBank = nameOfBank;
        this.fees = fees;
        this.locationOfBank = locationOfBank;
    }
}
