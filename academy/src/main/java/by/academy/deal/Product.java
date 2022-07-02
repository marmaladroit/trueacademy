package main.java.by.academy.deal;

import java.util.Objects;

public class Product {
        private String name;
        private double price;
        private int quantity;
        private double isTax;

    public User(String name, double price, isTax, int quantity) {
            this.name = name;
            this.price = price;
            this.isTax = isTax;
            this.quantity = quantity;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getIsTax() {
        return isTax;
    }

    public void setIsTax(double isTax) {
        this.isTax = isTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && quantity == product.quantity && Double.compare(product.isTax, isTax) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity, isTax);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isTax=" + isTax +
                '}';
    }

    private Product [] products;
}
}
