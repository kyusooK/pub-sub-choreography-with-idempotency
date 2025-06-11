package choreography.with.idempotency.domain;

import choreography.with.idempotency.domain.*;
import choreography.with.idempotency.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private String customerId;
    private String address;
    private String status;
}


