package eda.orders;

import eda.inventories.UpdateQuantityProductWhenOrderIsCreated;
import eda.shippings.SendProductWhenOrderIsCreated;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        final var sub = new Subject();
        sub.register(new UpdateQuantityProductWhenOrderIsCreated());
        sub.register(new SendProductWhenOrderIsCreated());

        final var order = new Order(
                "1",
                List.of(
                        new ProductItem("1", "Arroz", 10, 20),
                        new ProductItem("2", "Feijão", 12, 5)
                ),
                "007",
                Order.Status.CREATED,
                null
        );

        sub.publish(new OrderCreated(order));

    }
}
