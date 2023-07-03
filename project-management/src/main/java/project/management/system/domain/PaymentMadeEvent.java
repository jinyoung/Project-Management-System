package project.management.system.domain;

import java.util.*;
import lombok.*;
import project.management.system.domain.*;
import project.management.system.infra.AbstractEvent;

@Data
@ToString
public class PaymentMadeEvent extends AbstractEvent {

    private Object paymentType;
}
