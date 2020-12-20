package com.mn.spring.boot.activemq.reciever.consumer;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@EnableJms
public class MessageConsumer {

	@JmsListener(destination = "message-queue")
	private void listener(String message) {
		log.info("Message Recieved {} ",message);
	}
}
