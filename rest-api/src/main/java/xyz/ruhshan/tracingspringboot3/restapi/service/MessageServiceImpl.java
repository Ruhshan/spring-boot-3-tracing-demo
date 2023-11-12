package xyz.ruhshan.tracingspringboot3.restapi.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import xyz.ruhshan.tracingspringboot3.common.dto.Message;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    @Override
    public void handleMessage(Message message) {
        log.info("Processing message {}", message);
    }

}
