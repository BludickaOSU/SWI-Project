package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CustomerMoney customerMoney = new CustomerMoney(35000,18000);
        User u1 = new User("Matěj Červený",19,"Czech Republic",customerMoney);
        BankingService bankingService = new BankingService("Reifeisenbank",5,"Czech Republic");

    }
}