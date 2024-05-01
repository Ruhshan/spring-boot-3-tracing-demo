package xyz.ruhshan.tracingspringboot3.kafkaconsumer.consumer;

import java.util.*;
import lombok.extern.slf4j.*;
import org.apache.kafka.common.TopicPartition;
import org.springframework.kafka.annotation.*;
import org.springframework.kafka.listener.AbstractConsumerSeekAware;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;

@Component
@Slf4j
public class MessageConsumer extends AbstractConsumerSeekAware {
    @KafkaListener(topics = "topic-message", groupId = "message-consumer-group", containerFactory = "messageContainerFactory")
    public void consumeMessage(@Payload Message message) {
        log.info("Consumed kafka message {}", message);
    }

    @Override
    public void onPartitionsAssigned(Map<TopicPartition, Long> assignments, ConsumerSeekAware.ConsumerSeekCallback callback) {
        assignments.keySet().stream()
                .filter(partition -> "topic-message".equals(partition.topic()))
                .forEach(partition -> callback.seekToBeginning("topic-message", partition.partition()));

    }

}
