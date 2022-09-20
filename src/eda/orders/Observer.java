package eda.orders;

public interface Observer {

    void publish(OrderCreated event);

}
