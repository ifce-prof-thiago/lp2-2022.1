package eda.products;

import java.util.UUID;

public class Product {

    private String id;
    private String name;
    private double price;

    private Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static Product of(String name, double price) {
        final var id = UUID.randomUUID().toString();
        return new Product(
                id,
                name,
                price
        );
    }


    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }


}
