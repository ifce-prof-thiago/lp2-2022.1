package eda.inventories;

import eda.orders.Observer;
import eda.orders.OrderCreated;

public class UpdateQuantityProductWhenOrderIsCreated implements Observer {

    @Override
    public void publish(OrderCreated event) {
        System.out.println("When" + event.instant());

        event.payload().items().forEach(i -> {
            System.out.println("Subtrair " + i.quantity() + " do produto " + i.name());
            System.out.println("Product Id " + i.productId());
        });
    }

}
