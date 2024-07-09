package dev.lydtech.service;

import dev.lydtech.message.OrderCreated;
import dev.lydtech.message.OrderDispatched;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DispatchService {

    private static final String ORDER_DISPATCHED_TOPIC = "order.dispatched";
    private final KafkaTemplate<String, Object> kafkaProducer;

    public void process(OrderCreated orderCreated) throws Exception {
        OrderDispatched orderDispatched = OrderDispatched.builder()
                .orderId(orderCreated.getOrderId())
                .build();
    kafkaProducer.send(ORDER_DISPATCHED_TOPIC, orderDispatched).get();
    }

}
