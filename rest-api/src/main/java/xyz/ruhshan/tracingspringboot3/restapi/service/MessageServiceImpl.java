package xyz.ruhshan.tracingspringboot3.restapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import xyz.ruhshan.tracingspringboot3.common.dto.Message;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    private final RestClient restClient;
    public MessageServiceImpl(@Value("${rest-api-2.url}") String restApi2Url, RestClient.Builder restClientBuilder) {
        this.restClient  = restClientBuilder.baseUrl(restApi2Url)
            .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE).build();

    }

    @Override
    public void handleMessage(Message message) {
        log.info("Handling message {}", message);
        this.restClient.post().uri( "/process-message").body(message).retrieve();

    }

}
