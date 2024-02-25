package xyz.ruhshan.tracingspringboot3.kafkaconsumer.config;


import org.springframework.context.annotation.*;
import org.springframework.kafka.annotation.*;
import org.springframework.kafka.config.*;
import org.springframework.kafka.core.*;
import org.springframework.kafka.support.converter.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;

@Configuration
@EnableKafka
public class KafkaConsumerConfig {

    @Bean
    public RecordMessageConverter converter() {
        return new JsonMessageConverter();
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Message> messageConcurrentKafkaListenerContainerFactory(
        ConsumerFactory<String, Message> messageConsumerFactory
    ) {
        ConcurrentKafkaListenerContainerFactory<String, Message> factory =
            new ConcurrentKafkaListenerContainerFactory<>();

        factory.getContainerProperties().setObservationEnabled(true);

        factory.setConsumerFactory(messageConsumerFactory);

        return factory;

    }

}
