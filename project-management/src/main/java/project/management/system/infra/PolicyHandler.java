package project.management.system.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import project.management.system.config.kafka.KafkaProcessor;
import project.management.system.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    InspectionRepository inspectionRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InspectionStagesSetEvent'"
    )
    public void wheneverInspectionStagesSetEvent_SetPaymentDueDatesPolicy(
        @Payload InspectionStagesSetEvent inspectionStagesSetEvent
    ) {
        InspectionStagesSetEvent event = inspectionStagesSetEvent;
        System.out.println(
            "\n\n##### listener SetPaymentDueDatesPolicy : " +
            inspectionStagesSetEvent +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InspectionStagesSetEvent'"
    )
    public void wheneverInspectionStagesSetEvent_ManagePersonnelPolicy(
        @Payload InspectionStagesSetEvent inspectionStagesSetEvent
    ) {
        InspectionStagesSetEvent event = inspectionStagesSetEvent;
        System.out.println(
            "\n\n##### listener ManagePersonnelPolicy : " +
            inspectionStagesSetEvent +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InspectionStagesSetEvent'"
    )
    public void wheneverInspectionStagesSetEvent_RecordWorkingHoursPolicy(
        @Payload InspectionStagesSetEvent inspectionStagesSetEvent
    ) {
        InspectionStagesSetEvent event = inspectionStagesSetEvent;
        System.out.println(
            "\n\n##### listener RecordWorkingHoursPolicy : " +
            inspectionStagesSetEvent +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentMadeEvent'"
    )
    public void wheneverPaymentMadeEvent_MakePaymentPolicy(
        @Payload PaymentMadeEvent paymentMadeEvent
    ) {
        PaymentMadeEvent event = paymentMadeEvent;
        System.out.println(
            "\n\n##### listener MakePaymentPolicy : " +
            paymentMadeEvent +
            "\n\n"
        );
        // Sample Logic //

    }
}
