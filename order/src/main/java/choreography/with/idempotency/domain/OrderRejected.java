package choreography.with.idempotency.domain;

import choreography.with.idempotency.domain.*;
import choreography.with.idempotency.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerName;
    private String productId;
    private String productName;
    private Integer qty;
    private String status;

    public OrderRejected(Order aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
