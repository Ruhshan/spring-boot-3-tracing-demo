package xyz.ruhshan.tracingspringboot3.restapi.service;

import xyz.ruhshan.tracingspringboot3.common.dto.Message;

public interface MessageService {
    void handleMessage(Message message);
}
