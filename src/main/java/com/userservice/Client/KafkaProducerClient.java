package com.userservice.Client;

import com.netflix.discovery.converters.Auto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@Getter
@Setter
public class KafkaProducerClient {
    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
   public KafkaProducerClient(KafkaTemplate<String, String> kafkaTemplate) {
       this.kafkaTemplate = kafkaTemplate;
   }


   public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic,message);
   }


}
