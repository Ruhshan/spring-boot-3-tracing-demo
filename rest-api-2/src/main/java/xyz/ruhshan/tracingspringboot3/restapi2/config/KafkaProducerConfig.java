package xyz.ruhshan.tracingspringboot3.restapi2.config;

import java.util.*;
import org.apache.kafka.clients.producer.*;
import org.springframework.context.annotation.*;
import org.springframework.kafka.core.*;
import org.springframework.kafka.support.serializer.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public KafkaTemplate<String, Message> messageKafkaTemplate(ProducerFactory<String, Message> messageProducerFactory) {

        Map<String, Object> props = new HashMap<>();

        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        messageProducerFactory.updateConfigs(props);

        KafkaTemplate<String, Message> template = new KafkaTemplate<>(messageProducerFactory);
        template.setObservationEnabled(true);

        return template;

    }

}
