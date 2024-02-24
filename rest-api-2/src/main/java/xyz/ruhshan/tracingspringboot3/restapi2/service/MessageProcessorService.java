package xyz.ruhshan.tracingspringboot3.restapi2.service;

import xyz.ruhshan.tracingspringboot3.common.dto.*;

public interface MessageProcessorService {
    void processMessage(Message message);
}
