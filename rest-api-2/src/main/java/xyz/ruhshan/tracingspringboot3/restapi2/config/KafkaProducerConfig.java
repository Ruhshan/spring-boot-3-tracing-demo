package xyz.ruhshan.tracingspringboot3.restapi2.config;

import org.springframework.context.annotation.*;
import org.springframework.kafka.core.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public KafkaTemplate<String, Message> messageKafkaTemplate(
            ProducerFactory<String, Message> messageProducerFactory) {

        KafkaTemplate<String, Message> template = new KafkaTemplate<>(messageProducerFactory);
        template.setObservationEnabled(true);

        return template;
    }
}
