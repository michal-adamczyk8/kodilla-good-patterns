package com.kodilla.good.patterns.allegro;

public class PurchaseRequestRetriever {
    public PurchaseRequest retrieve(){
        User user = new User("koleś1", "jan.kowalski@gmail.com");
        String product = "Skarpetki";
        double quantity = 40.0;
        double price = 3.5;

        return new PurchaseRequest(user, product, quantity, price);
    }
}
