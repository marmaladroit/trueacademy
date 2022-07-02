package main.java.by.academy.deal;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class DealCore {
    private LocalDateTime buyTime;
    private User seller;
    private User buyer;
    private Product [] products;

    public DealCore(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(LocalDateTime buyTime) {
        this.buyTime = buyTime;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DealCore)) return false;
        DealCore dealCore = (DealCore) o;
        return seller.equals(dealCore.seller) && buyer.equals(dealCore.buyer) && Arrays.equals(products, dealCore.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seller, buyer);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "DealCore{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
