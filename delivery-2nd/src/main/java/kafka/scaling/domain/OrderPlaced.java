package kafka.scaling.domain;

import java.util.*;
import kafka.scaling.domain.*;
import kafka.scaling.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private Integer qty;
    private Long customerId;
    private String address;
}
