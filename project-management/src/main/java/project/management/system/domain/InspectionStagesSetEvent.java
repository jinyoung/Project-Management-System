package project.management.system.domain;

import java.util.*;
import lombok.*;
import project.management.system.domain.*;
import project.management.system.infra.AbstractEvent;

@Data
@ToString
public class InspectionStagesSetEvent extends AbstractEvent {

    private Object inspectionStages;
}
