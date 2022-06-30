package com.shinmj.kafkademo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "exam-topic", groupId = "foo")
    public void consume(String msg) throws IOException {
        log.info("Consumed message : %s", msg);
    }

}
