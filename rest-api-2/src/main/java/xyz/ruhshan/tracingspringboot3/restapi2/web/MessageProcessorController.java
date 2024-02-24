package xyz.ruhshan.tracingspringboot3.restapi2.web;

import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;
import xyz.ruhshan.tracingspringboot3.common.dto.*;
import xyz.ruhshan.tracingspringboot3.restapi2.service.*;

@Slf4j
@RestController
public class MessageProcessorController {
    private final MessageProcessorService messageProcessorService;

    public MessageProcessorController(MessageProcessorService messageProcessorService) {
        this.messageProcessorService = messageProcessorService;
    }

    @PostMapping("/process-message")
    public void processMessage(@RequestBody Message message) {
        log.info("Received message for processing {}", message);
        messageProcessorService.processMessage(message);
    }
}
