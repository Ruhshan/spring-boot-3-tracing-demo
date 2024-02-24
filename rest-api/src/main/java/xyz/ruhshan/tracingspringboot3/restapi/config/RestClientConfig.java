package xyz.ruhshan.tracingspringboot3.restapi.config;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.http.*;
import org.springframework.web.client.*;

@Configuration
public class RestClientConfig {
    @Bean("restApi2Client")
    RestClient restApi2Client(@Value("${rest-api-2.url}") String restApi2Url, RestClient.Builder restClientBuilder) {
        return restClientBuilder.baseUrl(restApi2Url)
            .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE).build();
    }

}
