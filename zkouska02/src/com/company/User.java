package com.company;

public class User {
    private String name;
    private int age;
    private String country;
    private CustomerMoney customerMoney;

    public User(String name, int age, String country, CustomerMoney customerMoney) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.customerMoney = customerMoney;
    }
}
