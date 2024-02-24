package xyz.ruhshan.tracingspringboot3.restapi2.service;

import lombok.extern.slf4j.*;
import org.springframework.stereotype.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;

@Slf4j
@Service
public class MessageProcessorServiceImpl implements MessageProcessorService {

    @Override
    public void processMessage(Message message) {
        log.info("Processing Message {}", message);
    }
}
