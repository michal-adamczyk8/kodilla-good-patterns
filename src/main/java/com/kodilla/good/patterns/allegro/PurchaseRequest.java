package com.kodilla.good.patterns.allegro;

public class PurchaseRequest {
    public User user;
    public String product;
    public double quantity;
    public double price;

    public PurchaseRequest(User user, String product, double quantity, double price) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
