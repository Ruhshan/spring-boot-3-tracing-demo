package xyz.ruhshan.tracingspringboot3.restapi2.service;

import lombok.extern.slf4j.*;
import org.springframework.kafka.core.*;
import org.springframework.stereotype.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;

@Slf4j
@Service
public class MessageProcessorServiceImpl implements MessageProcessorService {
    private final KafkaTemplate<String, Message> messageKafkaTemplate;

    public MessageProcessorServiceImpl(KafkaTemplate<String, Message> messageKafkaTemplate) {
        this.messageKafkaTemplate = messageKafkaTemplate;
    }

    @Override
    public void processMessage(Message message) {
        log.info("Processing Message {}", message);
        messageKafkaTemplate.send("topic-message", message);
    }
}
