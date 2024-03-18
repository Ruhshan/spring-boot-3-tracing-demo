package xyz.ruhshan.tracingspringboot3.kafkaconsumer.consumer;

import java.util.*;
import lombok.extern.slf4j.*;
import org.springframework.kafka.annotation.*;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;

@Component
@Slf4j
public class MessageConsumer {
    @KafkaListener(topics = "topic-message", groupId = "message-consumer-group", containerFactory = "messageContainerFactory")
    public void consumeMessage(@Payload Message message, @Headers Map<String, Object> allHeader) {
        log.info("Consumed kafka message {}", message);
    }
}
