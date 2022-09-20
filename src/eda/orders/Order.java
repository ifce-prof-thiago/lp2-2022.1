package eda.orders;

import eda.products.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

    private String id;
    private List<ProductItem> items = new ArrayList<>();
    private String customerId;
    private Status status;
    private Address address;

    public Order(String id, List<ProductItem> items, String customerId, Status status, Address address) {
        this.id = id;
        this.items = items;
        this.customerId = customerId;
        this.status = status;
        this.address = address;
    }

    public double total() {
        return items.stream()
                .map(item -> item.price() * item.quantity())
                .reduce(0.0, (subtotal, item) -> subtotal + item);
    }

    public enum Status {
        CREATED, FINISH, CANCEL
    }

    public String id() {
        return id;
    }

    public List<ProductItem> items() {
        return Collections.unmodifiableList(items);
    }

    public String customerId() {
        return customerId;
    }

    public Status status() {
        return status;
    }

    public Address address() {
        return address;
    }

}
