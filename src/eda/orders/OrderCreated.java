package eda.orders;

import java.time.Instant;

public class OrderCreated {

    private Instant instant;
    private Order payload;

    public OrderCreated(Order payload) {
        this.payload = payload;
        this.instant = Instant.now();
    }

    public Instant instant() {
        return instant;
    }


    public Order payload() {
        return payload;
    }

}
