package eda.shippings;

import eda.orders.Observer;
import eda.orders.OrderCreated;

public class SendProductWhenOrderIsCreated implements Observer {

    @Override
    public void publish(OrderCreated event) {
        System.out.println("When" + event.instant());
        System.out.println("SEND PRODUCT" );
    }

}
