
package xyz.ruhshan.tracingspringboot3.restapi.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import xyz.ruhshan.tracingspringboot3.common.dto.Message;
import xyz.ruhshan.tracingspringboot3.restapi.service.MessageService;

@RestController
@Slf4j
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping(value = "/message", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void postMessage(@RequestBody Message message) {
        log.info("Received message: {}", message);
        messageService.handleMessage(message);
    }

}